import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Database {

	public static void fillArray() throws IOException
	{
		Scanner myFile = new Scanner(new File("StudentList.txt"));
		ArrayList <Student> database = new ArrayList <Student> ();
		while (myFile.hasNext())
		{
			int counter = 0;
			String firstN = myFile.next();
			String lastN = myFile.next();
			double GPA = 0;
			String course1N = myFile.next();
			counter ++;
			int course1P = counter;
			String course1L = myFile.next();
			String course2N = myFile.next();
			counter ++;
			int course2P = counter;
			String course2L = myFile.next();
			String course3N = myFile.next();
			counter ++;
			int course3P = counter;
			String course3L = myFile.next();
			database.add(new Student(firstN, lastN, GPA, course1P, course2P, course3P, course1N, course2N, course3N, course1L, course2L, course3L));
		}
		
	}
}
