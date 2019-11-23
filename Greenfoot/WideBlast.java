import greenfoot.*;  


/**Child class of Blast.
*/

public class WideBlast extends Blast
{
   
	public WideBlast() {
		
	}
	
	public WideBlast(BlastGenerator  component) {
		
		com = component;
	}
	
/* extends removal of object hit from super class,Blast*/	
    public void act() 
    {
    	super.act();
    }
    
    
    /*It will generate blast at the location given, UI is updated for wide blast features.
    */
     public void generateBlast(int x, int y) {
    	com.generateBlast(x, y);
    	
    	MyWorld.myWorld.addObject(this, x, y);
	}    
}
