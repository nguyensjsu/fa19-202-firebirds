import greenfoot.Greenfoot;


public class LevelSecondStrategy implements ILevelsStrategy{

	private int winningScore = 200;
	
	
	public String getBackgroundImage() {
		
		return "b3.png";
	}

	public double getAngle(int x2, int y2) {

		return GameSupport.getAngleInRange(40, 60) + 180;
	}

	public ILevelsStrategy getNextLevelStrategy() {
		
		Greenfoot.setWorld(new Score());
		return this;
	}

	public int getLevelPassingScore() {
		return winningScore;
	}

    public int getSpeed() {
		
		return 9;
	}
	
    public int getStartCounterForLaunch() {
		
		return 40;
	}

	public int getCounterToReleaseExplosive() {
	
		return 80;
	}

	public int getRandom() {
	
		return 230;
	}

	/*

	public int getStartCounterForLaunch() {
        return 60;
    }

   
    public int getRandom(){
        return 460;
    }

    public int getSpeed() {
    
        return 6;
    }

    public int getCounterToReleaseExplosive() {
       
        return 80;
    }
*/
	

}
