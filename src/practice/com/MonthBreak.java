package practice.com;

public class MonthBreak {
 
	
	public void month() {

		String month="Feb";
		
		 switch (month){
		 
		 case "Jan": 
			 System.out.println("Jan");
			 break;
			 
		 case "Feb": 
			 System.out.println("Feb");
		     break;
		     
		 case "March": 
			 System.out.println("March");
		     break;
		 
		default:
			System.out.println("leaf year");
			                         
		 }
	}
	public void string() {
              
		String[] months ={"Jan","Feb","March","April","May","June","July","August","Sept","Oct","Nov","Dec"};
		
		for (String month : months) {
			if(month.equalsIgnoreCase("oct")) {
				System.out.println("found month is"+" "+month);
				break;
			}
		}
		
	}

			public static void main(String[] args) {

		System.out.println("123");
		   
		MonthBreak m=new MonthBreak();
		m.month();
		m.string();
		
		
	}

}
