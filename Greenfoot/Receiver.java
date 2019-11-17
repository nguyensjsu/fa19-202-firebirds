import greenfoot.*;  


public class Receiver 
{
   
     public void help(){
       
        Greenfoot.setWorld(new HelpMenu());
    }
   public void play(){
       Greenfoot.setWorld(new MyWorld());
    }
    
   
}
