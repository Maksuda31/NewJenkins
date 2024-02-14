
public class demoMultipleArray {

	public static void main(String[] args) {
		//2D array= an array of arrays
		// this is one way and the other way in another class
		
		String[][]cars= new String[3][3];
			
		cars[0][0]="Tesla";
		cars[0][1]="Ferari";
		cars[0][2]="Lamborghini";
		cars[1][0]="Toyota";
		cars[1][1]="Honda";
		cars[1][2]="Hyundai";
		cars[2][0]="Volvo";
		cars[2][1]="Chevrolet";
		cars[2][2]="Vox Wagon";
		
		for (int i=0; i<cars.length; i++) {System.out.println();
		for (int j=0; j<cars[i].length; j++) { System.out.print(cars [i][j]+" ");// only print. not println
		
		}
		
		}

	}

}
