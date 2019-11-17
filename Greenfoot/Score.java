import greenfoot.*;  


public class Score extends World
{

    public Score()
    {    
        super(650, 500, 1); 
        
        showFinalScore();
    }
    
    public void showFinalScore(){
    
        
     showText(" You Could Score A :", 240, 250);
     showText(Integer.toString(MyWorld.getHealthCounter().getValue()),370,250);
     
    }
    
    
    public void act(){
    
      
    }
   
}
