import greenfoot.*;  

public class StrongBlast extends Blast
{
    
    public StrongBlast()
    {
    	
    }
    
    public StrongBlast(BlastGenerator component)
    {
    	com = component;
    }
	
    public void act() 
    {
    	super.act();
    }

    public void generateBlast(int x, int y)
    {
    	com.generateBlast(x, y);
    	
    	MyWorld.myWorld.addObject(this, x, y);
    }    
}
