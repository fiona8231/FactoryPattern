import java.util.Scanner;

public class NewTesting {
    public static void main(String[] args){

        EnemyShip theEnemy = null;

      EnemyFactory shipFactory = new EnemyFactory();

        Scanner userIput = new Scanner(System.in);

        System.out.println("What type of enemy? U/R/B");

        if(userIput.hasNextLine()){

          String typeOfShip = userIput.nextLine();

          theEnemy = shipFactory.makeEnemyShip(typeOfShip);

        }

        if(theEnemy != null){
            doStuffEnemy(theEnemy);

        }else
            System.out.println("please Enter U/R/B");




    }
    public static void doStuffEnemy(EnemyShip newEnemyShip){

        newEnemyShip.displayEnemyShip();
        newEnemyShip.followShip();
        newEnemyShip.enemyShipShoot();

    }

}
