import greenfoot.export.mygame.MyGameClient;


public class LevelFirstStrategy implements ILevelsStrategy{

    
    private ILevelsStrategy secondLevelStrategy;
    private int winningScore = 100;
      
    public LevelFirstStrategy() {
        
        secondLevelStrategy = new LevelSecondStrategy();
    }

    public ILevelsStrategy getNextLevelStrategy() {
        return secondLevelStrategy;
    }

    public double getAngle(int x2, int y2) {
        return GameSupport.getAngleInRange(40, 60) + 180;
    }

    public String getBackgroundImage() {
        return "space.jpg";
    }

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

    public int getLevelPassingScore() {
        return winningScore;
    }
    
}
