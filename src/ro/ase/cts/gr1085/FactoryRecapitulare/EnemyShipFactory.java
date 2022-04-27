package ro.ase.cts.gr1085.FactoryRecapitulare;

public class EnemyShipFactory {
    public EnemyShip makeEnemyShip(String newShipType){
        EnemyShip newShip = null;
        if(newShipType.equals("u"))
            return new UFOEnemyShip();
        else if(newShipType.equals("r"))
            return new RocketEnemyShip();
        else if(newShipType.equals("b"))
            return new BigUFOShip();
        else return null;
    }
}
