import java.util.Comparator;
import java.util.Scanner;
public class ClassSort implements Comparator<Student>
{
	Scanner fred = new Scanner(System.in);
	
		
	public int compare(Student s1, Student s2)
	{
		return s1.getCourse1Name().compareTo(s2.getCourse1Name());
	}
	

	
	
	
}
