import java.util.Scanner;
public class Changing {
	
	public static void change() {
		Scanner userIntInput = new Scanner(System.in);
		System.out.println("What do you want to do?");
		System.out.println("[1] Change a students grade");
		System.out.println("[2] Switch a students classes");
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
		Scanner userIntInput = new Scanner(System.in);
		System.out.println("Which students grades do you want to change?");
		int studentChoice = userIntInput.nextInt();
	}
	
	public static void switchClasses() {
		Scanner userIntInput = new Scanner(System.in);
		System.out.println("Which students classes do you want to switch?");
		int studentChoice = userIntInput.nextInt();
	}
}
 