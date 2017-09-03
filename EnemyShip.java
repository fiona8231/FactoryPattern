
public abstract class EnemyShip {

    private String name;
    private double damage;

    public String getName(){ return name; }
    public void setName(String newName){
        this.name = newName;
    }

   public double getDamage(){ return damage; }
   public void setDamage(double newDamage){
       this.damage = newDamage;
   }

   public void followShip(){
       System.out.println(getName() + "is following the hero");

   }

   public void displayEnemyShip(){
       System.out.println(getName() + "is on the screen");

   }

   public void enemyShipShoot(){
       System.out.println(getName() + "attacks and does " + getDamage());
   }

}
