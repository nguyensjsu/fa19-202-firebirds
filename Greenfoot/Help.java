import greenfoot.*;  
/* Concrete Command Class - Command Pattern*/
public class Help implements ICommand
{
    
    Receiver rcv;
    /* define execute method*/
     public void execute(){
    rcv.help();
    }
    /*method to setReceiver*/
    public void setReceiver(Receiver rcv){
    this.rcv=rcv;
    }
    
   
}
