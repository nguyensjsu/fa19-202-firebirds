/*
Generates a bomb for aliens
*/

import greenfoot.*;

public class Bomb extends AlienExplosives {

     /**
     * Constructor for objects of class Bomb
     */
    public Bomb() {
        GreenfootImage image = new GreenfootImage("bomb1.png");
        setImage(image);
        healthCount = 5;
    }
}
