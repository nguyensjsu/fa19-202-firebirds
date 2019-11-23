/*
*Factory class for Heavy Metal generation
*/
public class MetalFactory extends AlienExplosiveFactory {
	/*
	 * Returns a Heavy Metal object
	 */
	@Override
	public AlienExplosives getExplosive() {

		return new Metal();
	}
}
