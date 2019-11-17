import greenfoot.Greenfoot;


public class LevelSecondStrategy implements LevelsStrategy{

	private int nextlevelScoreActivation = 200;
	
	
	public String getBackgroundImage() {
		
		return "planet.png";
	}
	public double getAngle(int x2, int y2) {
		
		return GameSupport.getAngle(x2, y2, Bazooka.planex, Bazooka.planey) + 3;
	}

	
	public int getRandom() {
	
		return 505;
	}

	public int getSecondLevelScoreActivation() {
		return nextlevelScoreActivation;
	}
public int getSpeed() {
		
		return 10;
	}

	public LevelsStrategy getSecondLevelStrategy() {
		
		Greenfoot.setWorld(new Score());
		return null;
	}
	
public int getStartCounterForLaunch() {
		
		return 40;
	}
	public int getCounterToRelaseExplosive() {
	
		return 80;
	}

	

}
