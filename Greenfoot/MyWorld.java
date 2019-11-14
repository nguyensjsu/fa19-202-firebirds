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

	
	
	static public Counter healthCounter;
	static public LevelStrategy levelStrategy = new LevelFirstStrategy();
	static private ConcurrentHashMap<Integer, Observer> aliens = new ConcurrentHashMap <Integer, Observer>();
	static public Counter counter;
	static BigDecimal travelDistance = new BigDecimal(0);

    public static MyWorld myWorld = new MyWorld();
	
 
    public MyWorld()
    {    
     
        super(650, 500, 1); 
        myWorld = this;
        prepare();
        setBackground(levelStrategy.getBackgroundImage());
        levelStrategy = new LevelFirstStrategy();
    }

    private void prepare()
    {

        Bazooka bazooka = Bazooka.bazooka;
      
        addObject(bazooka, 336, 251);
       
        Bazooka.planex = 336;
        Bazooka.planey = 251;
       
        counter = new Counter();
        counter.setPrefix("Score: ");
        addObject(counter, 100, 30);
       
        healthCounter= new Counter();
        healthCounter.setValue(100);
       healthCounter.setPrefix("Health : ");
        addObject(healthCounter, 200, 30);
        
  
    }
 
    @Override
    public void act() {
    	
    	super.act();
    	if(travelDistance.remainder(new BigDecimal(levelStrategy.getRandomFactor())).intValue() == 0){
    		Aliens aliens = IAliens.getAliens(GameSupport.getRandomAlien());
    		addObject(aliens, 650, 455);
    		
    	}
    	if(counter.getValue() > levelStrategy.getSecondLevelScoreActivation()){
    		levelStrategy = levelStrategy.getSecondLevelStrategy();
    		if(levelStrategy!=null)
        	setBackground(levelStrategy.getBackgroundImage());
    	}
    	if(getBackground()!=null)
    	scrollBackground();
    }
    
    private void scrollBackground()  
    {  
        GreenfootImage g = new GreenfootImage(getBackground());  
        getBackground().drawImage(g, -levelStrategy.getSpeed(), 0);  
        getBackground().drawImage(g, getWidth()-11, 0);  
        travelDistance = travelDistance.add(new BigDecimal(levelStrategy.getSpeed()));
    }

	public void addObserver(Observer observer) {
		
		aliens.put(observer.hashCode(), observer);
	}

	public void removeObserver(Observer observer) {
		
		aliens.remove(observer.hashCode());
	}

	public void notifyObserver(int damageX1, int damageX2) {
		
		Iterator<Entry<Integer, Observer>> entry = aliens.entrySet().iterator();
		while(entry.hasNext()){
			entry.next().getValue().update(damageX1, damageX2);
		}
	} 
	
	public static Counter getHealthCounter()
	{
	   return healthCounter;
   }
}
