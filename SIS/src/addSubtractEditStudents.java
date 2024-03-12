import java.util.*;
import java.util.Scanner;

	public class addSubtractEditStudents  {
	    public static void main(String[] args) {
	        
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
		
		String fname = userInput.nextLine();
		System.out.println("What is their last name?");
		String lname = userInput.nextLine();

		System.out.println("What is their first period?");
		String fp = userInput.nextLine();
		System.out.println("What is their first period grade?");
		String fpg = userInput.nextLine();
		
		System.out.println("What is their second period?");
		String sp = userInput.nextLine();
		System.out.println("What is their second period grade?");
		String spg = userInput.nextLine();
		
		System.out.println("What is their third period?");
		String tp = userInput.nextLine();
		System.out.println("What is their third period grade?");
		String tpg = userInput.nextLine();
        //Student.Students.add(new Student(fname, lname, fp,  sp, tp,  fpg, spg, tpg));
		//add student to database
	}
	public static void removeStudent() 
	{
		System.out.println("Sure, lets remove a student...");
		System.out.println("Which student would you like to delete?");
		//syso database with numbers before all students
		Scanner sc = new Scanner(System.in);
	    int choice = sc.nextInt();
	    //removes the chosen student from the database, along with all their grades and classes.
	}
}
