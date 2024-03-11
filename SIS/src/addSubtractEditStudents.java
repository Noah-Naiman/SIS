import java.util.*;
public class addSubtractEditStudents 
{
	public static void addStudent() 
	{
		System.out.println("Sure, lets add a student...");
		
		System.out.println("What is their first name?");
		Scanner sc= new Scanner(System.in);
		String fname= sc.next();
		System.out.println("What is their last name?");
		String lname= sc.next();

		System.out.println("What is their first period?");
		String fp = sc.next();
		System.out.println("What is their first period grade?");
		String fpg= sc.next();
		
		System.out.println("What is their second period?");
		String sp = sc.next();
		System.out.println("What is their second period grade?");
		String spg= sc.next();
		
		System.out.println("What is their third period?");
		String tp = sc.next();
		System.out.println("What is their third period grade?");
		String tpg= sc.next();
        students.add(new Student(fname, lname, fp,  sp, tp,  fpg, spg, tpg));
	}
	public static void removeStudent() 
	{
		System.out.println("Sure, lets remove a student...");
	}
}
