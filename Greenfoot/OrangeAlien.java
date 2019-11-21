import greenfoot.*; 


public class OrangeAlien extends Aliens
{
    private int health;
    private int score;
    
    public OrangeAlien() {
        GreenfootImage image = new GreenfootImage("orangeship.png");
        setImage(image);
    	score = 50;
    	health = 100;
    	alienexplosiveFactory = new MetalFactory();
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
