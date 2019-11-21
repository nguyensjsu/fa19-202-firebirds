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
        String message = " You win! Your Final Score: ";

        if (MyWorld.getHealthCounter().getValue() <= 0) {
            message = " You lost, Game over! Your Final Score: ";
        }

        showText(message, 240, 250);
        showText(Integer.toString(MyWorld.getScoreCounter().getValue()), 480, 250);
    }
    
    
    public void act()
    { 
    }
   
}
