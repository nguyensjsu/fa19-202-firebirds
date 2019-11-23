/* define Alien Objects*/
public class IAliens {
	/* return different Alien Objects based on the condition* to generate random aliens*/
	public static Aliens getAliens(String type){
		
		if(type.equalsIgnoreCase("orange")){
			return new OrangeAlien();
		}else if(type.equalsIgnoreCase("red")){
			return new RedAlien();
		}else {
			return new YellowAlien();
}
		
	}
	
}
