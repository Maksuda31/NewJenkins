
public class demoSwitch {

	public static void main(String[] args) {
		//Switch= statements that allows a variable to be tested for equally against a list of values
		
		String day = "Monday";
		switch (day)
		{
		case "Sunday":
			System.out.println("It's Sunday");
			break;
		case "Monday":
			System.out.println("It's Monday");
			break;
		case "Tuesday":
			System.out.println("It's Tuesday");
			break;
		case "Wednesday":
			System.out.println("It's Wednesday");
			break;
		case "Thursday":
			System.out.println("It's Thursday");
			break;
		case "Friday":
			System.out.println("It's Friday");
			break;
		case "Saturday":
			System.out.println("It's Saturday");
			break;
			
		default: System.out.println("It's not a day");
		}
		
	}

}
