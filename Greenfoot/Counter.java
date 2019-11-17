import greenfoot.*;
 
public class Counter extends Actor
{
    private int value;
    private int target;
    
    private static final Color color = new Color(0,0,0,0);
    private GreenfootImage bg;
    private String text_before;
  
    
      public Counter(String text_before)
    {
        bg= getImage();  
        this.text_before = text_before;
        value = 0;
        target = 0;
        
    }
    
    public Counter()
    {
        this(new String());
    }

 
    public void act() 
    {
         updateImage();
       
    }

    
    public int getValue()
    {
        return value;
    }
    public void addScore(int score)
    {
        value += score;
      
    }

  

     private void updateImage()
    {
        GreenfootImage image = new GreenfootImage(bg);
        GreenfootImage text = new GreenfootImage(text_before + value , 14, Color.WHITE, color);
        
        if (text.getWidth() > image.getWidth() - 20)
        {
            image.scale(text.getWidth() + 20, image.getHeight());
        }
        
        image.drawImage(text, (image.getWidth()-text.getWidth())/2, 
                        (image.getHeight()-text.getHeight())/2);
        setImage(image);
    } 
  
    
  
    public void setPrefix(String text_before)
    {
        this.text_before = text_before;
        updateImage();
    }
  public void setValue(int latest)
    {
        target = latest;
        value = latest;
        updateImage();
    }
   
   
    
    
 
}