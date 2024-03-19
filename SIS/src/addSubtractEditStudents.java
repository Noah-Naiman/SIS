import java.util.*;
import java.io.IOException;

	public class addSubtractEditStudents  {
		
	    public static void main(String[] args)throws IOException {
	        //Database.fillArrayList();
	        System.out.println("Would you like to add or remove a student? ");
	        System.out.println("a) add a student");
	        System.out.println("b) remove a student");
	        ;
	        Scanner sc= new Scanner(System.in);
	        String ans= sc.next();
	        if (ans.equals("a")) 
	        {
	            addStudent();
	        }
	        else if (ans.equals("b")) 
	        {
	            removeStudent();
	        }
	    }
	
	    public static void addStudent() {
	        Scanner userInput = new Scanner(System.in);
	        System.out.println("Sure, let's add a student...");

	        System.out.println("What is their first name?");
	        String firstN = userInput.nextLine();

	        System.out.println("What is their last name?");
	        String lastN = userInput.nextLine();

	        System.out.println("What is their first period?");
	        String course1N = userInput.nextLine();

	        System.out.println("What is their first period grade?");
	        String course2N = userInput.nextLine();

	        System.out.println("What is their second period?");
	        String course3N = userInput.nextLine();

	        System.out.println("What is their second period grade?");
	        String course1L = userInput.nextLine();

	        System.out.println("What is their third period?");
	        String course2L = userInput.nextLine();

	        System.out.println("What is their third period grade?");
	        String course3L = userInput.nextLine();
	        
		
	    System.out.println(firstN + " " + lastN + " 1. " + course1N + " " + course1L + " 2. " + course2N + " " + course2L + " 3. " + course3N + " " + course3L);
        Database.database.add(new Student(firstN, lastN, 0, 1, 2, 3, course1N, course2N, course3N, course1L, course2L, course3L));
        
	}//unfinished business ^^
	private static void removeStudent() 
	{
		System.out.println("Sure, lets remove a student...");
		System.out.println("Which student would you like to delete?");
		//syso database with numbers before all students
		Scanner sc = new Scanner(System.in);
	    int choice = sc.nextInt();
	    //removes the chosen student from the database, along with all their grades and classes.
	}

}
