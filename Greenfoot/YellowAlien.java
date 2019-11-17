import greenfoot.*;  


public class YellowAlien extends Aliens
{
    private int health;
    private int score;
    
    public YellowAlien() {
    	score = 40;
    	health = 60;
    	alienexplosiveFactory = new GrenadeFactory();
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
