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
	
	public static void addStudent() 
	{
		
		Scanner userInput= new Scanner(System.in);
		System.out.println("Sure, lets add a student...");
		
		System.out.println("What is their first name?");
		
		String f = userInput.nextLine();
		System.out.println("What is their last name?");
		String l = userInput.nextLine();

		System.out.println("What is their first period?");
		String c1N = userInput.nextLine();
		System.out.println("What is their first period grade?");
		String course1Letter = userInput.nextLine();
		
		System.out.println("What is their second period?");
		String c2N = userInput.nextLine();
		System.out.println("What is their second period grade?");
		String c2L = userInput.nextLine();
		
		System.out.println("What is their third period?");
		String c3N = userInput.nextLine();
		System.out.println("What is their third period grade?");
		String c3L = userInput.nextLine();
        Database.Student.add(new Student(f, l, 0, ,  sp, tp,  fpg, spg, tpg));
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
