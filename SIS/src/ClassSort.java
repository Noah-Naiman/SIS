import java.util.Comparator;
import java.util.Scanner;
public class ClassSort implements Comparator<Student>
{
	
	public static void getSortByClass()
	{
		Scanner userInt = new Scanner(System.in);
		System.out.println("Which class would you wish to sort by?");
		System.out.println("1) Algebra");
		System.out.println("2) Biology");
		System.out.println("3) English");
		int userSelection = userInt.nextInt();
		if(userSelection == 1)
		{
			compareClass1();
		}
		else if(userSelection == 2)
		{
			compareClass2();
		}
		else
		{
			compareClass3();
		}
	}
		
	public int compareClass1(Student s1, Student s2)
	{
		return s1.getCourse1Name().compareTo(s2.getCourse1Name());
	}
	
	public int compareClass2(Student s1, Student s2)
	{
		return s1.getCourse2Name().compareTo(s2.getCourse2Name());
	}
	
	public int compareClass3(Student s1, Student s2)
	{
		return s1.getCourse3Name().compareTo(s2.getCourse3Name());
	}
	
	
	
}
