import java.util.ArrayList;

public class demo2DArrayList {

	public static void main(String[] args) {
		// 2D ArrayList=
		
	ArrayList<ArrayList<String>> groceryList=new ArrayList<ArrayList<String>>();
		
		
	ArrayList<String> produceList= new ArrayList<String>();
		
	produceList.add("Cucumber");
	produceList.add("Tomatoes");
	produceList.add("Letuce");
		
	ArrayList<String> drinksList= new ArrayList<String>();
		
	drinksList.add("Soda");
	drinksList.add("Coffee");
	drinksList.add("Tea");

	ArrayList<String> foodList= new ArrayList<String>();
	
	foodList.add("Pasta");
	foodList.add("Noodles");
	foodList.add("Donuts");
	
	groceryList.add(produceList);
	groceryList.add(drinksList);
	groceryList.add(foodList);
	
//	System.out.println(groceryList);
//	System.out.println(groceryList.get(0));
//	System.out.println(groceryList.get(1));
//	System.out.println(groceryList.get(2));
	System.out.println(groceryList.get(0).get(0));
	}

}
