
public class demo2DArray {

	    public static void main(String[] args) {
	        // 2D array = an array of arrays
	    	//this is another way of displaying/coding for 2d array
	        
	    	String[][] cars = {
	                {"Tesla", "Ferari", "Lamborghini"},
	                {"Toyota", "Honda", "Hyundai"},
	                {"Volvo", "Chevrolet", "Vox Wagon"}
	        };

	        for (int i = 0; i < cars.length; i++) {
	            for (int j = 0; j < cars[i].length; j++) {
	                System.out.print(cars[i][j] + " "); // Print each element without a new line
	            }
	            System.out.println(); // Move the println outside the inner loop to print a newline after each row
	        }
	    }
	}
