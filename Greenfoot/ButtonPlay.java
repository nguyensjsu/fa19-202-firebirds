import greenfoot.*;  


public class ButtonPlay extends Button implements IInvoker
{
   ICommand invoke_cmd;
    ButtonPlay(){
        GreenfootImage image = new GreenfootImage("play-button.png");
        setImage(image);
    }
    
    public void click(){
        
        invoke_cmd.execute();
    }
    
    public void setCommand(ICommand command){
        
        this.invoke_cmd=command;
    }
    
    public void act(){
    
         if (Greenfoot.mouseClicked(this))  
        {  
           click();
        }  
    }
}
