import greenfoot.*;  


public class Score extends World
{

    public Score()
    {    
        super(1100, 700, 1); 
        showFinalScore();
    }
    
    public void showFinalScore()
    {   
        showText(" Your Final Score :", 240, 250);
        showText(Integer.toString(MyWorld.getScoreCounter().getValue()),370,250);
    }
    
    
    public void act()
    { 
    }
   
}
