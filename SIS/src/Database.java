import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

public class Database {
	static ArrayList <Student> database = new ArrayList <Student> ();
	public static void fillArray() throws IOException
	{

		Scanner myFile = new Scanner(new File("StudentList.txt"));
		

		while (myFile.hasNext())
		{//josh fisher changed "nextString" to "nextLine"
			int counter = 0;
			String firstN = myFile.nextLine();
			String lastN = myFile.nextLine();
			double GPA = 0;
			String course1N = myFile.nextLine();
			counter ++;
			int course1P = counter;
			String course1L = myFile.nextLine();
			String course2N = myFile.nextLine();
			counter ++;
			int course2P = counter;
			String course2L = myFile.nextLine();
			String course3N = myFile.nextLine();
			counter ++;
			int course3P = counter;
			String course3L = myFile.nextLine();
			database.add(new Student(firstN, lastN, GPA, course1P, course2P, course3P, course1N, course2N, course3N, course1L, course2L, course3L));
		}
		
	}
}
