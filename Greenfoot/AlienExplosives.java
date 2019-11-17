import greenfoot.Actor;


public class AlienExplosives extends Actor{

	private boolean explosiveDirectionLock = false;
	protected int healthCount = 10;
	
	public AlienExplosives() {
		
	}
	
	public void act() {
		
		if(!explosiveDirectionLock){
			int angle = (int)MyWorld.levelsStrategy.getAngle(getX(), getY());
			turn(angle);
			explosiveDirectionLock = true;
		}else{
			move(MyWorld.levelsStrategy.getSpeed());
			if (getX() == 0 || getY() == 0) {
				getWorld().removeObject(this);
			}
		}
	}

	public int getHealthCount() {
		return healthCount;
	}
	
	
	
}
