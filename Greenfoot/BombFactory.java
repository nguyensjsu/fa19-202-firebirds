
public class BombFactory extends AlienExplosiveFactory 
{
    
@Override
	public AlienExplosives getExplosive() {
		
		return new Bomb();
	}
}
