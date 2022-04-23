package ro.ase.cts.gr1085.tema1;

public class Main {
    public static void main(String[] args) {
        MasinaFactory masinaFactory = new MasinaFactory();

        InterfataMasina masinaCuVitezaMica = masinaFactory.getMasina(10);
        masinaCuVitezaMica.setCuloare("alba");
        InterfataMasina masinaCuVitezaMedie = masinaFactory.getMasina(50);
        masinaCuVitezaMedie.setCuloare("rosie");
        InterfataMasina masinaCuVitezaMare = masinaFactory.getMasina(100);
        masinaCuVitezaMare.setCuloare("neagra");

        masinaCuVitezaMica.statusMasina();
        masinaCuVitezaMedie.statusMasina();
        masinaCuVitezaMare.statusMasina();

    }
}
