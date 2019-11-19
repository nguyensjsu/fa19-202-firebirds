/**
 * A second, stronger weapons class
 * 
 * @author Sonia
 */
public class Laser extends Weapon 
{
    // instance variables - replace the example below with your own
    private int damage;

    /**
     * Constructor for objects of class Laser
     */
    public Laser()
    {
        destroyedArea = 350;
        weaponDecorator = new StrongBlast(new WideBlast((new ConcreteBlast())));
        damage = 40;
    }

    public void act()
    {
        super.act();
    }
    
    // Overide the default damage
    public int getDamage()
    {
        return damage;
    }
}
