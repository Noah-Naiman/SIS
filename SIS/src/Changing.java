import java.io.IOException;
import java.util.Scanner;
public class Changing {
	public static void main(String[] args) throws IOException 
	{
		change();
	}

	
	public static void change() {
		Scanner userIntInput = new Scanner(System.in);
		System.out.println("What do you want to do?");
		System.out.println("1) Change a students grade");
		System.out.println("2) Switch a students classes");
		int userChoice = userIntInput.nextInt();
		
		
		if(userChoice == 1)
		{
			changeGrades();
		}
		
		else if(userChoice == 2)
		{
			switchClasses();
		}
		
	}
	
	public static void changeGrades() {
		Scanner userStringInput = new Scanner(System.in);
		Scanner userIntInput = new Scanner(System.in);
		System.out.println("Which students grades do you want to change?");
		for(int i = 0; i < Database.database.size(); i++)
		{
			System.out.println(i+1 + ") " + Database.database.get(i).getFirstName() + " " + Database.database.get(i).getLastName());
		}
		int studentChoice = userIntInput.nextInt()-1;
		
		System.out.println("Which classes grades do you want to change?");
		System.out.println(1 + ") " + Database.database.get(studentChoice).getCourse1Name() + " " + Database.database.get(studentChoice).getCourse1Letter());
		System.out.println(2 + ") " + Database.database.get(studentChoice).getCourse2Name() + " " + Database.database.get(studentChoice).getCourse2Letter());
		System.out.println(3 + ") " + Database.database.get(studentChoice).getCourse3Name() + " " + Database.database.get(studentChoice).getCourse3Letter());
		int classChoice = userIntInput.nextInt();
		
		if(classChoice == 1) 
		{
			System.out.println("What do you want to change the grade to?");
			String gradeChoice = userStringInput.nextLine();
			Database.database.get(studentChoice).setCourse1Letter(gradeChoice);
			
		}
		
		else if(classChoice == 2) 
		{
			System.out.println("What do you want to change the grade to?");
			String gradeChoice = userStringInput.nextLine();
			Database.database.get(studentChoice).setCourse2Letter(gradeChoice);
			 
		}
		
		else if(classChoice == 3) 
		{
			System.out.println("What do you want to change the grade to?");
			String gradeChoice = userStringInput.nextLine();
			Database.database.get(studentChoice).setCourse3Letter(gradeChoice);
		}
		
		
		System.out.println("The new grades are:");
		System.out.println(Database.database.get(studentChoice).getCourse1Name() + " " + Database.database.get(studentChoice).getCourse1Letter());
		System.out.println(Database.database.get(studentChoice).getCourse2Name() + " " + Database.database.get(studentChoice).getCourse2Letter());
		System.out.println(Database.database.get(studentChoice).getCourse3Name() + " " + Database.database.get(studentChoice).getCourse3Letter());
		
	}
	
	public static void switchClasses() {
		Scanner userStringInput = new Scanner(System.in);
		Scanner userIntInput = new Scanner(System.in);
		System.out.println("Which students classes do you want to switch?");
		for(int i = 0; i < Database.database.size(); i++)
		{
			System.out.println(i + ") " + Database.database.get(i).getFirstName() + " " + Database.database.get(i).getLastName());
		}
		int studentChoice = userIntInput.nextInt();
		
		System.out.println("Which class do you want to switch?");
		System.out.println(1 + ") " + Database.database.get(studentChoice).getCourse1Name());
		System.out.println(2 + ") " + Database.database.get(studentChoice).getCourse2Name());
		System.out.println(3 + ") " + Database.database.get(studentChoice).getCourse3Name());
		int classChoice = userIntInput.nextInt();
		
		String tempClass;

		if (classChoice == 1) {
		    System.out.println("Which do you want to switch " + Database.database.get(studentChoice).getCourse1Name() + " to?");
		    System.out.println(1 + ") " + Database.database.get(studentChoice).getCourse2Name());
		    System.out.println(2 + ") " + Database.database.get(studentChoice).getCourse3Name());
		    int classChoice2 = userIntInput.nextInt();

		    if (classChoice2 == 1) {
		        tempClass = Database.database.get(studentChoice).getCourse1Name();
		        Database.database.get(studentChoice).setCourse1Name(Database.database.get(studentChoice).getCourse2Name());
		        Database.database.get(studentChoice).setCourse2Name(tempClass);

		    } else {
		        tempClass = Database.database.get(studentChoice).getCourse1Name();
		        Database.database.get(studentChoice).setCourse1Name(Database.database.get(studentChoice).getCourse3Name());
		        Database.database.get(studentChoice).setCourse3Name(tempClass);
		    }
		}
		
		else if (classChoice == 2) {
		    System.out.println("Which do you want to switch " + Database.database.get(studentChoice).getCourse2Name() + " to?");
		    System.out.println(1 + ") " + Database.database.get(studentChoice).getCourse1Name());
		    System.out.println(2 + ") " + Database.database.get(studentChoice).getCourse3Name());
		    int classChoice2 = userIntInput.nextInt();

		    if (classChoice2 == 1) {
		        tempClass = Database.database.get(studentChoice).getCourse2Name();
		        Database.database.get(studentChoice).setCourse2Name(Database.database.get(studentChoice).getCourse1Name());
		        Database.database.get(studentChoice).setCourse1Name(tempClass);

		    } else {
		        tempClass = Database.database.get(studentChoice).getCourse2Name();
		        Database.database.get(studentChoice).setCourse2Name(Database.database.get(studentChoice).getCourse3Name());
		        Database.database.get(studentChoice).setCourse3Name(tempClass);
		    }
		}
		
		else if (classChoice == 3) {
		    System.out.println("Which do you want to switch " + Database.database.get(studentChoice).getCourse3Name() + " to?");
		    System.out.println(1 + ") " + Database.database.get(studentChoice).getCourse1Name());
		    System.out.println(2 + ") " + Database.database.get(studentChoice).getCourse2Name());
		    int classChoice2 = userIntInput.nextInt();

		    if (classChoice2 == 1) {
		        tempClass = Database.database.get(studentChoice).getCourse3Name();
		        Database.database.get(studentChoice).setCourse3Name(Database.database.get(studentChoice).getCourse1Name());
		        Database.database.get(studentChoice).setCourse1Name(tempClass);

		    } else {
		        tempClass = Database.database.get(studentChoice).getCourse3Name();
		        Database.database.get(studentChoice).setCourse3Name(Database.database.get(studentChoice).getCourse2Name());
		        Database.database.get(studentChoice).setCourse2Name(tempClass);
		    }
		}
		
		System.out.println("The new order of classes are:");
		System.out.println("Class 1: " + Database.database.get(studentChoice).getCourse1Name());
		System.out.println("Class 2: " + Database.database.get(studentChoice).getCourse2Name());
		System.out.println("Class 3: " + Database.database.get(studentChoice).getCourse3Name());
		
	}
	
	
}
 