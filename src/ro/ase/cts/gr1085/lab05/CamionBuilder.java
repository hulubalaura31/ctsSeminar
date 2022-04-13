package ro.ase.cts.gr1085.lab05;

public class CamionBuilder implements Builder{
    private String sasiu;
    private String producator;
    private int nrRoti;
    private String motor;
    private String interior;

    @Override
    public Builder addSasiu(){
        this.sasiu = "afesf";
        return  this;
    }

    @Override
    public Builder addProducator(){
        this.producator = "mercedes";
        return  this;
    }

    @Override
    public Builder addRoti(){
        this.nrRoti = 6;
        return  this;
    }

    @Override
    public Builder addMotor(){
        this.motor = "Diesel";
        return  this;
    }

    @Override
    public Builder addInterior(){
        this.interior = "bbbbbbbbbbbbbbbbb";
        return  this;
    }

    @Override
    public Automobil getAutomobil(){
        return  new Automobil(sasiu, motor, producator, nrRoti, interior);
    }

}
