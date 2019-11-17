import greenfoot.*;  

public class Help implements ICommand
{
    
    Receiver rcv;
    
     public void execute(){
    rcv.help();
    }
    public void setReceiver(Receiver rcv){
    this.rcv=rcv;
    }
    
   
}
