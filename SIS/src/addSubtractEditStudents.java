import java.util.*;
import java.text.DecimalFormat;
import java.io.IOException;

	public class addSubtractEditStudents  {
		
	    public static void main(String[] args)throws IOException {
	    	addOrRemove();
	    }
	    
	    public static void addOrRemove()throws IOException {
	        //Database.fillArrayList();
	    	
	        System.out.println("Add or Delete a Student ");
	        System.out.println("1) Add a student");
	        System.out.println("2) Delete a student");
	        ;
	        Scanner sc= new Scanner(System.in);
	        String ans= sc.next();
	        if (ans.equals("1")) 
	        {
	            addStudent();
	        }
	        else if (ans.equals("2")) 
	        {
	            removeStudent();
	        }
	    }
	
	    public static void addStudent() {
	        Scanner userInput = new Scanner(System.in);
	        System.out.println("Sure, let's add a student...");

	        System.out.println("What is their first name?");
	        String firstN = userInput.nextLine();

	        System.out.println("What is their last name?");
	        String lastN = userInput.nextLine();

	        System.out.println("What is their first period?");
	        String course1N = userInput.nextLine();

	        System.out.println("What is their first period grade?");
	        String course1L = userInput.nextLine();

	        System.out.println("What is their second period?");
	        String course2N = userInput.nextLine();

	        System.out.println("What is their second period grade?");
	        String course2L = userInput.nextLine();

	        System.out.println("What is their third period?");
	        String course3N = userInput.nextLine();

	        System.out.println("What is their third period grade?");
	        String course3L = userInput.nextLine();
	        
	        
	        
	    System.out.println(firstN + " " + lastN  + " " + course1N + " " + course1L + " " + course2N + " " + course2L + " " + course3N + " " + course3L);
        Database.database.add(new Student(firstN, lastN, 0, 1, 2, 3, course1N, course2N, course3N, course1L, course2L, course3L));
        
	}//unfinished business ^^
	private static void removeStudent() 
	{
		System.out.println("Sure, lets remove a student...");
		System.out.println("Which student would you like to delete?");
		for (int i = 0; i < Database.database.size(); i++) 
		{
	        System.out.println((i + 1) + ") " +Database.database.get(i).getFirstName() + " " + Database.database.get(i).getLastName());
	    }//numbers the students(^^^^^^^^^^^^)
		//syso database with numbers before all students starting with 1, doenst work, says arraylist has length 0.
		Scanner sc = new Scanner(System.in);
	    int choice = sc.nextInt();
	    Database.database.remove(choice - 1);
	    //removes the chosen student from the database, along with all their grades and classes.
	}
	

}
	
	
	
	
	
	//GPA CALCULATOR
//    double gpa = 0.00;
//    
//    if (course1L.equals("A+") || course2L.equals("A+") || course3L.equals("A+")) {gpa += 4.3;}System.out.println("a"+gpa);
//    if (course1L.equals("A" ) || course2L.equals("A" ) || course3L.equals("A" )) {gpa += 4;}System.out.println("b"+gpa);
//    if (course1L.equals("A-") || course2L.equals("A-") || course3L.equals("A-")) {gpa += 3.7;}System.out.println("c"+gpa);
//    if (course1L.equals("B+") || course2L.equals("B+") || course3L.equals("B+")) {gpa += 3.3;}System.out.println("d"+gpa);
//    if (course1L.equals("B" ) || course2L.equals("B" ) || course3L.equals("B" )) {gpa += 3;}System.out.println("e"+gpa);
//    if (course1L.equals("B-") || course2L.equals("B-") || course3L.equals("B-")) {gpa += 2.7;}System.out.println("f"+gpa);
//    if (course1L.equals("C+") || course2L.equals("C+") || course3L.equals("C+")) {gpa += 2.3;}System.out.println("g"+gpa);
//    if (course1L.equals("C" ) || course2L.equals("C" ) || course3L.equals("C" )) {gpa += 2;}System.out.println("h"+gpa);
//    if (course1L.equals("C-") || course2L.equals("C-") || course3L.equals("C-")) {gpa += 1.7;}System.out.println("i"+gpa);
//    if (course1L.equals("D+") || course2L.equals("D+") || course3L.equals("D+")) {gpa += 1.3;}System.out.println("j"+gpa);
//    if (course1L.equals("D" ) || course2L.equals("D" ) || course3L.equals("D" )) {gpa += 1;}System.out.println("k"+gpa);
//    if (course1L.equals("D-") || course2L.equals("D-") || course3L.equals("D-")) {gpa += .7;}System.out.println("l"+gpa);
//    if (course1L.equals("F" ) || course2L.equals("F" ) || course3L.equals("F" )) {gpa += 0;}System.out.println("m"+gpa);
//    System.out.println("n"+gpa);
//    gpa = gpa/3;
//    System.out.println("o"+gpa);	
//    DecimalFormat df = new DecimalFormat("#.##");
//    String str = df.format(gpa);
//    //googled this one ^^^
//    //string to double
//    double formattedGPA = Double.parseDouble(str);