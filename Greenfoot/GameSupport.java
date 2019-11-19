import java.util.Random;
import greenfoot.Greenfoot;




public class GameSupport {

	
	public static void doNothing(int timeInMilliseconds){
		int counter = 0;
		while(counter < timeInMilliseconds){
			counter++;
		}
	}
	
	public static String getRandomAlien(){
		String[] color = {"yellow", "red", "orange", "random"};
		return color[Math.abs((getRandNumber(color.length - 1) + 1) % color.length)];
	}
	
	public static int getRandNumber(int seed){
		Random random = new Random();
		return random.nextInt(seed);
	}

	public static int getAngle(int x, int y, int x2, int y2){
		double xd = x2 - x;
		double yd = y2 - y;
		return (int)Math.toDegrees(Math.atan2(yd, xd));
	}

	public static int getAngleInRange(int start, int end){
		return Greenfoot.getRandomNumber(end-start)+start;
	}
	
	
	
}
