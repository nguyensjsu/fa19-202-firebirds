import greenfoot.*;  


public class RedAlien extends Aliens
{
    private int health;
    private int score;

    public RedAlien()
    {
        score = 20;
        health = 40;
        alienexplosiveFactory = new BombFactory();
    }
    
    public void act() 
    {
       super.act();
       if (getX() == 0) {
            getWorld().removeObject(this);
            MyWorld.myWorld.removeObserver(this);
            return;
       }
       // alien has been hit by a weapon
       if (this.getOneIntersectingObject(Weapon.class) != null) {
            // update score by 10
            getWorld().getObjects(Counter.class).get(0).addScore(score);
            health -= score;
       }
       if (health == 0) {
           getWorld().removeObject(this);
           return;
       }
    }    
}
