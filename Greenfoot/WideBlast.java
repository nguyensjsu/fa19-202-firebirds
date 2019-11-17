import greenfoot.*;  

public class WideBlast extends Blast
{
   
	public WideBlast() {
		
	}
	
	public WideBlast(BlastGenerator  component) {
		
		com = component;
	}
	
    public void act() 
    {
    	super.act();
    }

	public void generateBlast(int x, int y) {
    	com.generateBlast(x, y);
    	
    	MyWorld.myWorld.addObject(this, x, y);
	}    
}
