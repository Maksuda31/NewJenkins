import java.util.Scanner;

public class demoWhileLoop {
	public static void main (String[]args) {
		
		//while loop= executes a block of code as long as its condition remains true
		
		Scanner scanner = new Scanner(System.in);
		String name= " ";
		
		while (name.isBlank()){
			System.out.print("Enter your name");
			name=scanner.nextLine();}
	
		System.out.print("Hello"+name);
	}

}
