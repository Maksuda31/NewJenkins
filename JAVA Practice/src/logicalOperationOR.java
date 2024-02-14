import java.util.Scanner;

public class logicalOperationOR {

//	public static void main(String[] args) {
//		
//		// ||= (OR) either condition must be true
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("You are playing a game! press q or Q to quit the game");
//		String response= scanner.next();
//		
//		if (response.equals("q")|| response.equals("Q")) {
//			System.out.print("You quit the game");
//		}
//		else {
//			System.out.print("You are still playing the game");
//		}
		
		public static void main(String[] args) {
			
			// != (NOT) reverses bolean value of a condition
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("You are playing a game! press q or Q to quit the game");
			
			String response= scanner.next();
			
			if (!response.equals("q")&& !response.equals("Q")) {
				
				System.out.print("You are still playing the game");
			}
			else {
				System.out.print("You quit the game");
			}
	}

}
