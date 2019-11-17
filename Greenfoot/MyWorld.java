import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;



import greenfoot.*;  


public class MyWorld extends World implements Subject
{

    
    
    static public Counter healthBazookaCounter;
    static public LevelsStrategy levelsStrategy = new LevelFirstStrategy();
    static private ConcurrentHashMap<Integer, Observer> aliens = new ConcurrentHashMap <Integer, Observer>();
    static public Counter scoreCntr;
    static BigDecimal travelDistance = new BigDecimal(0);

    public static MyWorld myWorld = new MyWorld();
    
 
    public MyWorld()
    {    
     
        super(650, 500, 1); 
        myWorld = this;
        prepare();
        setBackground(levelsStrategy.getBackgroundImage());
        levelsStrategy = new LevelFirstStrategy();
    }

    private void prepare()
    {

        Bazooka bazooka = Bazooka.bazooka;
      
        addObject(bazooka, 336, 251);
       
        Bazooka.planex = 336;
        Bazooka.planey = 251;
       
        scoreCntr = new Counter();
        scoreCntr.setPrefix("Score: ");
        addObject(scoreCntr, 100, 30);
       
        healthBazookaCounter= new Counter();
        healthBazookaCounter.setValue(100);
        healthBazookaCounter.setPrefix("Health : ");
        addObject(healthBazookaCounter, 200, 30);
        
  
    }
 
  
    private void scrollBackground()  
    {  
        GreenfootImage g = new GreenfootImage(getBackground());  
        getBackground().drawImage(g, -levelsStrategy.getSpeed(), 0);  
        getBackground().drawImage(g, getWidth()-11, 0);  
        travelDistance = travelDistance.add(new BigDecimal(levelsStrategy.getSpeed()));
    }
      @Override
    public void act() {
        
        super.act();
        if(travelDistance.remainder(new BigDecimal(levelsStrategy.getRandom())).intValue() == 0){
            Aliens aliens = IAliens.getAliens(GameSupport.getRandomAlien());
            addObject(aliens, 650, 455);
            
        }
        if(scoreCntr.getValue() > levelsStrategy.getSecondLevelScoreActivation()){
            levelsStrategy = levelsStrategy.getSecondLevelStrategy();
            if(levelsStrategy!=null)
            setBackground(levelsStrategy.getBackgroundImage());
        }
        if(getBackground()!=null)
        scrollBackground();
    }

    public void notifyObserver(int X1, int X2) {
        
        Iterator<Entry<Integer, Observer>> entry = aliens.entrySet().iterator();
        while(entry.hasNext()){
            entry.next().getValue().update(X1, X2);
        }
    } 
    public void addObserver(Observer observer) {
        
        aliens.put(observer.hashCode(), observer);
    }

    public void removeObserver(Observer observer) {
        
        aliens.remove(observer.hashCode());
    }

    
    
    public static Counter getHealthCounter()
    {
       return healthBazookaCounter;
   }
}
