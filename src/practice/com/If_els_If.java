package practice.com;

public class If_els_If {

	public static void main(String[] args) {
         int score =80;
         
         if (score>=80)
        	 System.out.println("GradeA");
         else if(score>=85) {
        	 System.out.println("GradeB");
         }
         else if(score>=80) {
        	 System.out.println("GradeC");
         }
         else if (score>=75) {
        	 System.out.println("GradeD");
         }
         else if (score>=60) {
        	 System.out.println("GradeE");
         }
         else {
        	 System.out.println("Marks");
         }
	}

}
