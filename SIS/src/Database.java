import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

public class Database {
	static ArrayList <Student> database = new ArrayList <Student> ();

	public static void fillArray() throws IOException
	{

		//Scanner myFile = new Scanner(new File("Student"));
		

		Scanner myFile = new Scanner(new File("StudentList.txt"));
		


		while (myFile.hasNext())
		{
			int counter = 0;
			String firstN = myFile.next();
			String lastN = myFile.next();
			double GPA = 0;
			String course1N = myFile.next();
			int course1P = counter;
			String course1L = myFile.next();
			String course2N = myFile.next();
			int course2P = counter;
			String course2L = myFile.next();
			String course3N = myFile.next();
			int course3P = counter;
			String course3L = myFile.nextLine();
			database.add(new Student(firstN, lastN, GPA, course1N, course2N, course3N, course1L, course2L, course3L));
		}
		
	}
}
