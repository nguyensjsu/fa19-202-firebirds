import greenfoot.*; 


public class Fire extends Weapon
{
    private int damage;

    public Fire()
    {
        destroyedArea = 350;
        weaponDecorator = new StrongBlast(new WideBlast((new ConcreteBlast())));
        damage = 20;
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
