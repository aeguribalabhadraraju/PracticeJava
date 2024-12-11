package practice.com;

public class BreakStatement {

	public static void main(String[] args) {
		
		int Day=12;
		
		String dayName;
		
		switch(Day) {
		
		case 1:
			dayName ="Monday";
			break;
		case 2:
			dayName ="Tuesday";
			break;
		case 3:
			dayName="wendsday";
			break;
		case 4:
			dayName="Thursday";
			break;
		case 5:
			dayName="Friday";
			break;
		case 6:
			dayName="Saturday";
			break;
		case 7:
			dayName="Sunday";
			break;
			default:
				dayName="invalid day";
				
			break;
		}
		
     System.out.println("The day is "+dayName);
	}

}
