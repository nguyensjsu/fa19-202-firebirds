/* 
 * Show Help Contents
 * 
 */

import greenfoot.*;

public class HelpMenu extends World {

  /**
   * Constructor for objects of class HelpMenu
   */
  public HelpMenu() {
    super(1100, 700, 1);
    GreenfootImage image = new GreenfootImage("HelpContent.png");
    image.scale(1100, 700);
    setBackground(image);

  }
  
 /**
   * Go back to menu otions on clicking screen
   */
  
    public void act() {
      if (Greenfoot.mouseClicked(this))  
        {  
            Greenfoot.setWorld(new MenuWorld());
           
        }  
    }
}
