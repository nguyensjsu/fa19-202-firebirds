/*
*Factory class for Bomb generation
*/
public class BombFactory extends AlienExplosiveFactory {

	/*
	 * Returns a bomb object
	 */
	@Override
	public AlienExplosives getExplosive() {

		return new Bomb();
	}
}
