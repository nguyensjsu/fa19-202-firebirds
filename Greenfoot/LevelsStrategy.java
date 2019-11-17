
public interface LevelsStrategy {
public int getRandom();
	
	public String getBackgroundImage();
	public int getCounterToRelaseExplosive();
	public int getSecondLevelScoreActivation();
	public LevelsStrategy getSecondLevelStrategy();
	public  double getAngle(int x2, int y2);
	public int getSpeed();
	public int getStartCounterForLaunch();
	
}
