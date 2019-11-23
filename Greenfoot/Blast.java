import greenfoot.*; 

/** Defines features of a blast. IT is a parent class 
*/
public class Blast extends Actor implements BlastGenerator {
	BlastGenerator  com;

	
	public Blast() {

	}
  
	public Blast(BlastGenerator component) {
		com = component;
	}
        
	/*defines what happens to the target if the blast hits/ Target is removed */
	public void act() {
		
		move(-5);
		if (getX() == 0) {
			getWorld().removeObject(this);
		}
	}
         /*Generates a Blast 
	 @param x,y -locations where blast is hit
	 */
	public void generateBlast(int x, int y) {
		getWorld().addObject(this, x, y);
	}
}
