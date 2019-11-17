import greenfoot.*; 


public class OrangeAlien extends Aliens
{
    private int health;
    private int score;
    
    public OrangeAlien() {
    	score = 50;
    	health = 100;
    	alienexplosiveFactory = new MetalFactory();
    }
    public void act() 
    {
       super.act();
       if (getX() == 0) {
            getWorld().removeObject(this);
            MyWorld.myWorld.removeObserver(this);
            return;
       }
    }    
}
