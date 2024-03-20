import java.util.Collections;
import java.util.Scanner;
import java.io.IOException;


public class SISRunner {
	static Scanner userLongInput = new Scanner(System.in);
	static Scanner userIntInput = new Scanner(System.in);


	public static void main(String[] args) throws IOException 
	{

		System.out.println("What would you like to do in the student data base? ");
		System.out.println("1) add or delete a student");
		System.out.println("2) change student grades/schedule");
		System.out.println("3) sort students");
		int firstChoice = userIntInput.nextInt();
		Database.fillArray();

		//Display.displayStudents();

		
		if (firstChoice == 1)
		{
			addSubtractEditStudents.addOrRemove();
		}
		else if (firstChoice == 2)
		{
			Changing.change();
		}
		else if (firstChoice == 3)
		{
			System.out.println("How would you like to sort the students? ");
			System.out.println("1) By Last Name");
			System.out.println("2) By GPA");
			System.out.println("3) By Class Period");
			int sortingChoice = userIntInput.nextInt();
			if (sortingChoice == 1)
			{
				Collections.sort(Database.database, new NameSort());
			}
			else if (sortingChoice == 2)
			{
				Collections.sort(Database.database, new GPASort());
			}
			else if (sortingChoice == 3)
			{
				Collections.sort(Database.database, new ClassSort());
			}
			
		}
		 

	}
	
	
	
	
	
}
