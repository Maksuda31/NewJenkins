
public class demoArray {

	public static void main(String[] args) {
		
		//Array=used to store multiple values in a single variables.
		
//		String [] cars= {"BMW", "Tesla", "Chevrolet", "Toyota", "Honda"};
//		cars [0]= "BMW";
//		System.out.println(cars[3]);
		
		String [] cars= new String[4];
		cars[0]="Tesla";
		cars[1]="BMW";
		cars[2]="Toyota";
		cars[3]="Honda";
		
		//System.out.println(cars[2]);
		
		for(int i=0;i<cars.length; i++) { System.out.println(cars[i]);}
		
}
}
