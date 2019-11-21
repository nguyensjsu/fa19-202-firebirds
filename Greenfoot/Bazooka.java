import java.util.ArrayList;
import java.util.List;

import greenfoot.*; 


public class Bazooka extends Actor
{
    static Bazooka bazooka = new Bazooka();
    
    private boolean press_a = false;
    private boolean press_s = false;
    private boolean press_d = false;
    private boolean press_w = false;
    
    int grenadeCount = 50;
    int bombCount = 50;
    int metalCount = 50;
   
    static int planex = 0;
    static int planey = 0;

    private static final int totalHealth = 100;
    
    //  health
    Counter healthCounter = MyWorld.getHealthCounter();
    protected BlastGenerator weaponDecorator;
    
    private Bazooka ()
    {
        weaponDecorator = new StrongBlast(new ConcreteBlast());
    }

    private int getExplosivesDamage(int playerHealth, AlienExplosives explosive) {
        int health = explosive.getHealthCount();

        // increase damage as player loses health
        if (playerHealth < (totalHealth / 2)) {
            health *= 2;
        }

        else if (playerHealth < (totalHealth / 4)) {
            health *= 3;
        }

        return health;
    }
    
    public void act()
    {
        planey = getY();
        planex = getX();
        
        if (this.getWorld() == null)
        {
            Greenfoot.stop();
        }
        
        if (this.getOneIntersectingObject(AlienExplosives.class) != null)
        {
            Object explosive = this.getOneIntersectingObject(AlienExplosives.class);
            int health = 0;
            if(explosive instanceof AlienExplosives)
            {
                health = getExplosivesDamage(MyWorld.healthBazookaCounter.getValue(), (AlienExplosives) explosive);

                getWorld().removeObject(this.getOneIntersectingObject(AlienExplosives.class));
                weaponDecorator.generateBlast(planex, planey);
                if (MyWorld.healthBazookaCounter.getValue() <= 0)
                {
                   
                     Greenfoot.setWorld(new Score());
                    
                }
                else
                {
                    int scoreChange = MyWorld.healthBazookaCounter.getValue() - health;
                    if(scoreChange > 0 )
                    {
                        MyWorld.healthBazookaCounter.addScore(-health);
                    }
                    else
                    {
                        MyWorld.healthBazookaCounter.setValue(0);
                        
                        
                        Greenfoot.setWorld(new Score());
                        
                    }
                }
            }
        }

        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + 10);
        }
        
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - 10);
        }
        
        if (Greenfoot.isKeyDown("right"))
        {
            move(10);
        }
        
        if (Greenfoot.isKeyDown("left"))
        {
            move(-10);
        }
        
        if (!press_a && Greenfoot.isKeyDown("a"))
        {
            press_a = true;
            if (grenadeCount > 0)
            {
                getWorld().addObject(new Fire(), getX(), getY());
                grenadeCount--;
            }
        }
        
        if (press_a && !Greenfoot.isKeyDown("a"))
        {
            press_a = false;
        }
       
        if (!press_s && Greenfoot.isKeyDown("s"))
        {
            press_s = true;
            if (bombCount > 0)
            {
                getWorld().addObject(new Fire(), getX(), getY());
                bombCount--;
            }
        }
        
        if (press_s && !Greenfoot.isKeyDown("s"))
        {
            press_s = false;
        }
        
        if (!press_d && Greenfoot.isKeyDown("d"))
        {
            press_d = true;
            if (metalCount > 0)
            {
                getWorld().addObject(new Fire(), getX(), getY());
                metalCount--;
            }
        }
        
        if (press_d && !Greenfoot.isKeyDown("d"))
        {
            press_d = false;
        }

        shootLaser();
        
        if (getY() >= 650)
        {
            getWorld().addObject(new StrongBlast(), getX(), getY());
            getWorld().removeObject(this);
            Greenfoot.setWorld(new Score());
        }
    }
   
    private void shootLaser()
    {
        if (!press_w && Greenfoot.isKeyDown("w"))
        {
            press_w = true;
            getWorld().addObject(new Laser(), getX(), getY());
        }
       
        if (press_w && !Greenfoot.isKeyDown("w"))
        {
            press_w = false;
        }
    }
    
}
