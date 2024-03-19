import java.util.Scanner;

public class CalculateGPA {
	public static void calculateGPA()
	{
		for (int i = 0; i < Database.database.size(); i ++)
		{
			String [] courses = new String [3];
			courses [0] = Database.database.get(i).getCourse1Letter();
			courses[1] = Database.database.get(i).getCourse2Letter();
			courses[2] = Database.database.get(i).getCourse3Letter();
			
		}
	}
}
