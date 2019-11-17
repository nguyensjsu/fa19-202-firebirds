
public class IAliens {

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
