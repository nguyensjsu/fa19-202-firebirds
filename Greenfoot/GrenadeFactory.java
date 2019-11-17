
public class GrenadeFactory extends AlienExplosiveFactory 
{
    
@Override
	public AlienExplosives getExplosive() {
		
		return new Grenade();
	}
}
