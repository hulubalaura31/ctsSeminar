package ro.ase.cts.gr1085.recapitulareFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip enemyShip = null;
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextLine()){
            String typeOfShip = scanner.nextLine();
            enemyShip = shipFactory.makeEnemyShip(typeOfShip);
            if(enemyShip!=null){
                doStuff(enemyShip);
            }
        }
    }

    public static void doStuff(EnemyShip enemyShip){
        enemyShip.shootsHeroShip();
        enemyShip.displayHeroShip();
        enemyShip.followHeroShip();
    }
}
