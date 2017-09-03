import java.util.Scanner;

public class EnemyShipTesting {

    public static void main(String[] args){

    //EnemyShip ufoShip = new UFOEnemyShip();
     EnemyShip theEnemy = null;


        // The worse way to do it, as it is not dynamic
        Scanner userInput = new Scanner(System.in);
        String enemyShipOption = "";
        System.out.println(" What type of ship? (U/R)");

        if(userInput.hasNextLine()){
            enemyShipOption = userInput.nextLine();
        }

        if(enemyShipOption.equals("U")){
            theEnemy = new UFOEnemyShip();
        } else{
            if (enemyShipOption.equals("R")){
                theEnemy = new RocketEnemyShip();
            }
        }

        doStuffEnemy(theEnemy);
    }

    public static void doStuffEnemy(EnemyShip newEnemyShip){

        newEnemyShip.displayEnemyShip();
        newEnemyShip.followShip();
        newEnemyShip.enemyShipShoot();

    }


}
