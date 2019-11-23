import greenfoot.*;  


/** Child class of blast. It is a type of blast defined.
*/

public class StrongBlast extends Blast
{
    
    public StrongBlast()
    {
    	
    }
    
    public StrongBlast(BlastGenerator component)
    {
    	com = component;
    }
    
    /*extends removal of object from super class*/
    public void act() 
    {
    	super.act();
    }
     
     /*UI is updated for what a strong blast looks like
      @param x,y -locations where blast is hit
      */
    public void generateBlast(int x, int y)
    {
    	com.generateBlast(x, y);
    	
    	MyWorld.myWorld.addObject(this, x, y);
	Greenfoot.playSound("bombex.mp3");
	
    }    
}
