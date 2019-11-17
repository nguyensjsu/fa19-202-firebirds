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
       if (getX() == 0) {
            getWorld().removeObject(this);
            MyWorld.myWorld.removeObserver(this);
            return;
       }
    }    
}
