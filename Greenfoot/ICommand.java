import greenfoot.*;  
/* interface for command pattern*/
public interface ICommand
{
 /*method to set target receiver and execute actual command*/
 public void setReceiver(Receiver rcv);
    public void execute(); 
    
    
    
          
}
