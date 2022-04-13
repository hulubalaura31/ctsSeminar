package ro.ase.cts.gr1085.lab05;

public class Automobil {
        private String sasiu;
        private String motor;
        private String producator;
        private int nrRoti;
        private String interior;

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    @Override
    public String toString() {
        return "Automobil{" +
                "sasiu='" + sasiu + '\'' +
                ", motor='" + motor + '\'' +
                ", producator='" + producator + '\'' +
                ", nrRoti=" + nrRoti +
                ", interior='" + interior + '\'' +
                '}';
    }

    public int getNrRoti() {
        return nrRoti;
    }

    public void setNrRoti(int nrRoti) {
        this.nrRoti = nrRoti;
    }

    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public void setSasiu(String sasiu){
            this.sasiu = sasiu;
        }

        public String getSasiu(){
            return sasiu;
        }

        public void setMotor(String motor){
            this.motor = motor;
        }

        public String getMotor(){
            return motor;
        }

    public Automobil(String sasiu, String motor, String producator, int nrRoti, String interior) {
        this.sasiu = sasiu;
        this.motor = motor;
        this.producator = producator;
        this.nrRoti = nrRoti;
        this.interior = interior;
    }

    public Automobil getAutomobil(){
            return  new Automobil(sasiu, motor, producator, nrRoti, interior);
        }

}
