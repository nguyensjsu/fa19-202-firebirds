import greenfoot.*;  


public class Weapon extends Actor
{
    
	protected BlastGenerator  weaponDecorator;

	protected int destroyedArea = 20;
	
    public void act() 
    {
       
    	super.act();
    	setLocation(getX(), getY()+10); 
    	if(getY() >= 440){
    		MyWorld.myWorld.notifyObserver(getX()-destroyedArea,getX()+destroyedArea);
    		weaponDecorator.generateBlast(getX(), getY());
    		
    		getWorld().removeObject(this);
    	}
    }

	
}
