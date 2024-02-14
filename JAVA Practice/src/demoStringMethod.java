
public class demoStringMethod {

	public static void main(String[] args) {
		// String= a reference data type that can store one or more characters
		//			reference data type have access to useful methods
		
		String name ="Maks   ";
//		Boolean result =name.equals("Maks");
//		Boolean result =name.equalsIgnoreCase("maks");
		
//		int result= name.length(); 
//		char result= name.charAt(0);
//		int result= name.indexOf("k");
//		Boolean result=name.isEmpty();
//		Boolean result=name.isBlank();
//		String result=name.toUpperCase();
//		String result=name.toLowerCase();
//		String result=name.trim();// this method will remove any space from the string.
		String result=name.replace('s', 'Z');
		
		
		
		System.out.println(result);

	}

}
