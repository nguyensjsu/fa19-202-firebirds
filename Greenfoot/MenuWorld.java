import greenfoot.*;


public class MenuWorld extends World
{

   
    public MenuWorld()
    {    
        
        super(1100, 700, 1); 
        prepare();
    }
    
    
     private void prepare()  
    {  
           
        Receiver playRcv = new Receiver();
    
        Play pc=new Play();
        Help hc=new Help();
        Receiver helpRcv = new Receiver();
        
        pc.setReceiver(playRcv);   
        hc.setReceiver(helpRcv);
        
        ButtonPlay bp = new ButtonPlay();      
        ButtonHelp bh = new ButtonHelp(); 
        
        bh.setCommand(hc);
        bp.setCommand(pc);
        
        
        addObject(bp, 450, 251);
        addObject(bh, 590, 251);
       
        //Greenfoot.playSound("backgroundmusic.mp3");
        
    }  
    
     public void act()  
    {  
       
    }  
    
}
