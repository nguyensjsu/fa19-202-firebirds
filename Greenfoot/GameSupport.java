import java.util.Random;
import greenfoot.Greenfoot;

/* Define getter Methods that return objects that are used in MyWorld class */

public class GameSupport {

	
	public static void doNothing(int timeInMilliseconds){
		int counter = 0;
		while(counter < timeInMilliseconds){
			counter++;
		}
	}
	/*method to get random color to generate alien*/
	public static String getRandomAlien(){
		String[] color = {"yellow", "red", "orange", "random"};
		return color[Math.abs((getRandNumber(color.length - 1) + 1) % color.length)];
	}
	/*getter method for random number */
	public static int getRandNumber(int seed){
		Random random = new Random();
		return random.nextInt(seed);
	}
	/*getter method for angle*/
	
	public static int getAngle(int x, int y, int x2, int y2){
		double xd = x2 - x;
		double yd = y2 - y;
		return (int)Math.toDegrees(Math.atan2(yd, xd));
	}
	/*getter method for Angle in Range*/
	public static int getAngleInRange(int start, int end){
		return Greenfoot.getRandomNumber(end-start)+start;
	}
	
	
	
}
