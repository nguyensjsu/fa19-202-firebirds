import greenfoot.export.mygame.MyGameClient;


public class LevelFirstStrategy implements LevelsStrategy{

    
    private LevelsStrategy secondLevelStrategy;
    private int secondlevelScoreActivation = 100;
    
  
    
    public int getStartCounterForLaunch() {
      
        return 60;
    }
      
    public LevelFirstStrategy() {
        
        secondLevelStrategy = new LevelSecondStrategy();
    }
   

    public double getAngle(int x2, int y2) {
        
        return GameSupport.getAngleInRange(40, 60) + 180;
    }
     public LevelsStrategy getSecondLevelStrategy() {
        return secondLevelStrategy;
    }

   
    public int getRandom(){
        return 460;
    }
     public int getSpeed() {
    
        return 6;
    }

    public String getBackgroundImage() {
       
        return "space.jpg";
    }
public int getCounterToRelaseExplosive() {
       
        return 80;
    }
     public int getSecondLevelScoreActivation() {
        return secondlevelScoreActivation;
    }
    
}
