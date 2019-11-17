import greenfoot.*;  


public class Play implements ICommand
{
    
     Receiver c;
    
    public void setReceiver(Receiver c){
    this.c=c;
    }
   
   
    public void execute(){
    c.play();
    }
    
   
}
