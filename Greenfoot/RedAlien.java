import greenfoot.*;  


public class RedAlien extends Aliens
{
    // determines how many shots it takes to defeat the Alien
    private int health;
    
    // points the player will get for defeating Alien
    private int score;

    public RedAlien()
    {
        GreenfootImage image = new GreenfootImage("redship.png");
        setImage(image);
        score = 20;
        health = 40;
        alienexplosiveFactory = new BombFactory();
    }
    
    public void act() 
    {
       super.act();
       if (getX() == 0)
       {
            getWorld().removeObject(this);
            MyWorld.myWorld.removeObserver(this);
            return;
       }
       
       // alien has been hit by a weapon
       Weapon weapon = (Weapon) this.getOneIntersectingObject(Weapon.class);
       if (weapon != null)
       {
            health -= weapon.getDamage();
       }
       if (health == 0)
       {
           // update score by 10
           getWorld().getObjects(Counter.class).get(0).addScore(score);
           getWorld().removeObject(this);
           return;
       }
    }    
}
