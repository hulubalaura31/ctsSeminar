package ro.ase.cts.gr1085.recapitulareFactory;

public abstract class EnemyShip {
    private String name;
    private int damage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void followHeroShip(){
       System.out.println(getName() + "is following the hero");
    }

    public void displayHeroShip(){
        System.out.println(getName() + "is displaying");
    }

    public void shootsHeroShip(){
        System.out.println(getName() + "is is shooting the hero and does " + getDamage());
    }
}
