import greenfoot.*; 


public class Fire extends Weapon {
	
	public Fire() {
		
		destroyedArea = 150;
	
		weaponDecorator = new StrongBlast(new WideBlast((new ConcreteBlast())));
	}

	public void act() {
		
		super.act();
	}

}
