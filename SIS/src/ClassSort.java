import java.util.Comparator;
public class ClassSort implements Comparator<Student>
{
	
	
		
	public int compare(Student s1, Student s2)
	{
		return s1.getCourse1Name().compareTo(s2.getCourse1Name());
	}
	

	
	
	
}
