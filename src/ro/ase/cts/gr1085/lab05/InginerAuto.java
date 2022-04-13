package ro.ase.cts.gr1085.lab05;

public class InginerAuto {
    Builder builder;

    public InginerAuto(String buildername) throws Exception {
        if(buildername.equalsIgnoreCase("Autoturism")){
            this.builder = new AutoturismBuilder();
        }else if(buildername.equalsIgnoreCase("Camion")){
            this.builder = new CamionBuilder();
        }else throw new Exception();
    }

    public void buildAutomobil(){
        builder.addInterior().addMotor().addRoti().addProducator().addSasiu();
    }

    public Automobil getAutomobil(){
        return builder.getAutomobil();
    }
}
