import greenfoot.*; 


public class ButtonHelp extends Button implements IInvoker
{
   ICommand cmd;
    ButtonHelp(){
        GreenfootImage help;
        help = new GreenfootImage("help.png");
        setImage(help);
    }
    
    public void click(){
        
        cmd.execute();
    }
    
      public void act(){
    
         if (Greenfoot.mouseClicked(this))  
        {  
           click();
        }  
    }
    
    public void setCommand(ICommand cmd){
        
        this.cmd=cmd;
    }
    
  
}
