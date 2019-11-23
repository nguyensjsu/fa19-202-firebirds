
public interface ILevelsStrategy {
public int getRandom();
	
	public String getBackgroundImage();

	public int getCounterToReleaseExplosive();

	public int getLevelPassingScore();

	public ILevelsStrategy getNextLevelStrategy();

	public  double getAngle(int x2, int y2);

	public int getSpeed();

	public int getStartCounterForLaunch();
	
}
