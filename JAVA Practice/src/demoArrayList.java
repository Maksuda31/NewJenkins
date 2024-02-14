import java.util.ArrayList;

public class demoArrayList {

	public static void main(String[] args) {
		
//			 array list= a re-sizeable array. 
//						Elements can be added or removed after compilation phase
//						Store reference data type.
		
		ArrayList<String> food= new ArrayList<String>();
		
		food.add("Pizza");
		food.add("hotdog");
		food.add("hamburger");
		food.set(1,"Sushi");// we can replace it using this method
		food.remove(2);// we can remove item using this method
//		food.clear();// using this method, we can clear all food
		
		for (int i=0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
	}
}
