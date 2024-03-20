import java.util.Scanner;

public class Display {
	public static void displayStudents()
	{
		System.out.println("The student database contains: ");
		for (int i = 0; i < Database.database.size(); i ++)
		{
			String firstNameDisplay = Database.database.get(i).getFirstName();
			String lastNameDisplay = Database.database.get(i).getLastName();
			double gpaDisplay = Database.database.get(i).getGpa();
			String course1NameDisplay = Database.database.get(i).getCourse1Name();
			String course2NameDisplay = Database.database.get(i).getCourse2Name();
			String course3NameDisplay = Database.database.get(i).getCourse3Name();
			String course1LetterDisplay = Database.database.get(i).getCourse1Letter();
			String course2LetterDisplay = Database.database.get(i).getCourse2Letter();
			String course3LetterDisplay = Database.database.get(i).getCourse3Letter();
			System.out.printf(" %-11s %-13s %-6d %-9s %-9s %-9s %-9s %-4 %-4s %-4s", firstNameDisplay, lastNameDisplay, gpaDisplay, course1NameDisplay, course2NameDisplay, course3NameDisplay, course1LetterDisplay, course2LetterDisplay, course3LetterDisplay);
		}
	}
}
