import greenfoot.*;


public class MenuWorld extends World
{

   
    public MenuWorld()
    {    
        
        super(650, 500, 1); 
        prepare();
    }
    
    
     private void prepare()  
    {  
           
        Receiver playRcv = new Receiver();
        
        Play pc=new Play();  
        
        pc.setReceiver(playRcv);                 
        
        ButtonPlay bp = new ButtonPlay();      
        
        bp.setCommand(pc);
        
        addObject(bp, 150, 251);
       
        //Greenfoot.playSound("backgroundmusic.mp3");
        
    }  
    
     public void act()  
    {  
       
    }  
    
}
