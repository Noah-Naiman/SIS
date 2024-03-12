import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Database {

	public static void fillArray() throws IOException
	{
		Scanner myFile = new Scanner(new File("Student"));
		ArrayList <Student> database = new ArrayList <Student> ();
		while (myFile.hasNext())
		{
			int counter = 0;
			String firstN = myFile.nextString();
			String lastN = myFile.nextString();
			double GPA = 0;
			String course1N = myFile.nextString();
			counter ++;
			int course1P = counter;
			String course1L = myFile.nextString();
			String course2N = myFile.nextString();
			counter ++;
			int course2P = counter;
			String course2L = myFile.nextString();
			String course3N = myFile.nextString();
			counter ++;
			int course3P = counter;
			String course3L = myFile.nextString();
			database.add(new Student(firstN, lastN, GPA, course1P, course2P, course3P, course1N, course2N, course3N, course1L, course2L, course3L));
		}
		
	}
}
