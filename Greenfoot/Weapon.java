import greenfoot.*;  

public class Weapon extends Actor implements WeaponsInterface
{
    
    protected BlastGenerator weaponDecorator;
    protected int destroyedArea = 20;
    
    // the default damage for weapons
    private int damage = 10;
    
    public void act() 
    {
        super.act();
        setLocation(getX(), getY()+10); 
        if(getY() >= 640)
        {
            MyWorld.myWorld.notifyObserver(getX()-destroyedArea,getX()+destroyedArea);
            weaponDecorator.generateBlast(getX(), getY());
            
            getWorld().removeObject(this);
        }
    }
    
    public int getDamage()
    {
        return damage;
    }
    
}
