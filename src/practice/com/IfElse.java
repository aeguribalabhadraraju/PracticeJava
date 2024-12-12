package practice.com;


//if else conditions example

public class IfElse {
	
         public void age() {
          int age = 11;
          
          if (age>=18) {
        	  
        	  System.out.println("Eligible for Vote");
          }
          else {
        	  System.out.println("Not Eligible for Vote");
          }
	}
         public void Pension() {
                 
        	  int pensionShceme =55;
        	  
        	  if (pensionShceme==55 && pensionShceme<=35) {
        		  
        		  System.out.println("Elible for pension");
        	  }
        	  
        	  
        	  else {
        		  System.out.println("Not eligible for pension");
        	  }
		}
         public void movies() {
        	 int age= 18;
        	 
        	 if (age<=10 && age==18) {
        		 
        		 System.out.println("Allowed to movie mall");
        		 
        	 }
        	 else {
        		 System.out.println("Not allowed movie mall");
        	 }

		}
          
     public static void main(String[] args) {
            System.out.println("pension money is 3k ");
            
            IfElse m=new IfElse();
            m.age();
            m.Pension();
            m.movies();
            		
}

}
