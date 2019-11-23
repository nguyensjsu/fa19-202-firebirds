/*
 A child of weapons class that generates Fire used by Bazooka
 */

import greenfoot.*;

public class Fire extends Weapon {
    private int damage;

    /**
     * Constructor for objects of class Fire
     */
    public Fire() {
        destroyedArea = 350;
        weaponDecorator = new StrongBlast(new WideBlast((new ConcreteBlast())));
        damage = 20;
    }

    public void act() {
        super.act();
    }

    // Getting the new value of damage
    public int getDamage() {
        return damage;
    }
}
