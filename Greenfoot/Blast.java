import greenfoot.*; 


public class Blast extends Actor implements BlastGenerator {
	BlastGenerator  com;

	
	public Blast() {

	}

	public Blast(BlastGenerator component) {
		com = component;
	}

	public void act() {
		
		move(-5);
		if (getX() == 0) {
			getWorld().removeObject(this);
		}
	}

	public void generateBlast(int x, int y) {
		getWorld().addObject(this, x, y);
	}
}
