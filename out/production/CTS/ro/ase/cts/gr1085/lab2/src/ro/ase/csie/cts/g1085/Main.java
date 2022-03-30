package ro.ase.csie.cts.g1085;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 3200.5, 1,ProductCategory.valueOf("laptop"), 1123, "procesor A13");
        Product p2 = new Product("Frigider", 207.95, 1,ProductCategory.valueOf("electrocasnice"), 1245, "clasa A");
        Product p3 = new Product(p1);

        p3.setName("Paine");
        System.out.println(p1.equals(p2));

        Map<Product, Integer> stock = new HashMap<Product, Integer>();
        stock.put(p1,2);
        stock.put(p3,3);

        OnlineShop onlineShop = new OnlineShop("Altex", "altex.jpg", stock);

        User user = new User("Ana", "1");
        Map<Product, Integer> cart = new HashMap<Product, Integer>();
        cart.put(p1,1);
        cart.put(p3,2);
        user.setCart(cart);

        user.placeOrder(onlineShop, "Dr. Taberei");


    }
}

class OnlineShop {
    private String name;
    private String image;
    private Map<Product, Integer> stock;

    OnlineShop(String name, String image, Map<Product, Integer> stock)
    {
        this.stock = new HashMap<>();
        for (Map.Entry<Product, Integer> mapEntry : stock.entrySet()) {
            this.stock.put(mapEntry.getKey(), mapEntry.getValue());
        }
        this.image = image;
        this.name = name;
    }

    public void modifyStock(Product product, int quantity)
    {
        if (quantity > 0) {
            this.stock.put(product, quantity);
        } else {
            this.stock.remove(product);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Product, Integer> getStock() {
        return stock;
    }

    public void setStock(Map<Product, Integer> stock) {
        this.stock = new HashMap<>();
        for (Map.Entry<Product, Integer> mapEntry : stock.entrySet()) {
            this.stock.put(mapEntry.getKey(), mapEntry.getValue());
        }
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

enum ProductCategory{
    laptop,
    electrocasnice,
    alimente
}

class Product
{
    private int id;
    private String name;
    private double price;
    private int type;
    private ProductCategory category;
    private String details; // ex.: processor, memory, power, volume (for refrigerators etc)

    public Product(String name, double price, int type, ProductCategory category, int id, String details)
    {
        try{
            if(name.length() < 2){
                throw new Exception();
            }else{
                this.name = name;
            }
            if(id < 0){
                throw new Exception();
            }else{
                this.id = id;
            }

        }catch(Exception e){
            System.out.println("Something went wrong.");
        }

        this.price = price;
        this.type = type;
        this.category = category;
        this.details = details;
    }

    public Product(Product p)
    {
        this(p.getName(),p.getPrice(), p.getType(), p.getCategory(), p.getId(), p.getDetails());
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public boolean equals(Product product)
    {
        if(product.id != this.id)
            return false;
        if(!product.name.equals(this.name))
            return false;
        if(product.price != this.price)
            return false;
        if(product.type != this.type)
            return false;
        if(product.category != this.category)
            return false;

        return true;
    }


    public void applyDiscount(double val){
        this.price-=this.price*val/100;
    }

    public void raisePrice(double val){
        this.price+=this.price*val/100;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }
}

class User
{
    private String username;
    private String id;
    private ArrayList<Order> ordersHistory;
    private Map<Product, Integer> cart;

    public User(String name, String id) {
        this.username = name;
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Order> getOrdersHistory() {
        return ordersHistory;
    }

    public void setOrdersHistory(ArrayList<Order> ordersHistory) {
        this.ordersHistory = new ArrayList<>();
        for(int i = 0; i<ordersHistory.size(); i++){
            this.ordersHistory.add(ordersHistory.get(i));
        }
    }

    public void placeOrder(OnlineShop shop, String address){
        for (Map.Entry<Product, Integer> mapEntry : this.cart.entrySet()) {
            int productStock = shop.getStock().get(mapEntry.getKey());
            shop.getStock().put(mapEntry.getKey(), productStock - mapEntry.getValue());
            this.cart.put(mapEntry.getKey(), mapEntry.getValue());
        }
        cleanCart();
        Random random = new Random();
        ordersHistory.add(new Order(random.nextInt(), address ));

    }

    public Map<Product, Integer> getCart() {
        return cart;
    }

    public void setCart(Map<Product, Integer> cart) {
        this.cart = new HashMap<>();
        for (Map.Entry<Product, Integer> mapEntry : cart.entrySet()) {
            this.cart.put(mapEntry.getKey(), mapEntry.getValue());
        }
    }

    public User(String username, String id, Map<Product, Integer> cart)
    {
        this.username = username;
        this.id = id;
        cart=new HashMap<Product, Integer>();
        for (Map.Entry<Product, Integer> mapEntry : cart.entrySet()) {
            this.cart.put(mapEntry.getKey(), mapEntry.getValue());
        }
    }

    public User(User user)
    {
        this(user.getUsername(),user.getId(), user.getCart());
    }


    public void addOrder(Order order)
    {
        this.ordersHistory.add(order);
    }

    public void addProductToCart(Product product, int quantity, OnlineShop shop)
    {
        int stock = shop.getStock().get(product);
        if(stock >= quantity) {
            this.cart.put(product, quantity);
        }else{
            System.out.println("Not enough stock for this product");
        }
    }

    public void removeProductFromCart(Product product, int quantity)
    {
        if(quantity > 0) {
            this.cart.remove(product, quantity);
        }
    }

    public void cleanCart(){
        cart = new HashMap<Product, Integer>();
    }
}

class Order
{
    private int id;
    private String address;

    public Order(int id, String address){
        this.id = id;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}





