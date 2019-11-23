/*
*Factory class for Grenade generation
*/
public class GrenadeFactory extends AlienExplosiveFactory {
	/*
	 * Returns a Grenade object
	 */
	@Override
	public AlienExplosives getExplosive() {

		return new Grenade();
	}
}
