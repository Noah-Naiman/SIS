import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;  

public class CalculateGPA {
	public static void calculateGPA()
	{
		for (int i = 0; i < Database.database.size(); i ++)
		{
			String [] courses = new String [3];
			courses [0] = Database.database.get(i).getCourse1Letter();
			courses[1] = Database.database.get(i).getCourse2Letter();
			courses[2] = Database.database.get(i).getCourse3Letter();
			double scale1 = 0;
			double scale2 = 0;
			double scale3 = 0;
			if (courses [0] == "A+")
			{
				scale1 = 4.00;
			}
			else if (courses[0] == "A")
			{
				scale1 = 4.00;
			}
			else if (courses[0] == "A-")
			{
				scale1 = 3.70;
			}
			else if (courses[0] == "B+")
			{
				scale1 = 3.30;
			}
			else if (courses[0] == "B")
			{
				scale1 = 3.00;
			}
			else if (courses[0] == "B-")
			{
				scale1 = 2.70;
			}
			else if (courses[0] == "C+")
			{
				scale1 = 2.30;
			}
			else if (courses[0] == "C")
			{
				scale1 = 2.00;
			}
			else if (courses[0] == "C-")
			{
				scale1 = 1.70;
			}
			else if (courses[0] == "D+")
			{
				scale1 = 1.30;
			}
			else if (courses[0] == "D")
			{
				scale1 = 1.00;
			}
			else if (courses[0] == "F")
			{
				scale1 = 0.00;
			}
			
			if (courses [1] == "A+")
			{
				scale2 = 4.00;
			}
			else if (courses[1] == "A")
			{
				scale2 = 4.00;
			}
			else if (courses[1] == "A-")
			{
				scale2 = 3.70;
			}
			else if (courses[1] == "B+")
			{
				scale2 = 3.30;
			}
			else if (courses[1] == "B")
			{
				scale2 = 3.00;
			}
			else if (courses[1] == "B-")
			{
				scale2 = 2.70;
			}
			else if (courses[1] == "C+")
			{
				scale2 = 2.30;
			}
			else if (courses[1] == "C")
			{
				scale2 = 2.00;
			}
			else if (courses[1] == "C-")
			{
				scale2 = 1.70;
			}
			else if (courses[1] == "D+")
			{
				scale2 = 1.30;
			}
			else if (courses[1] == "D")
			{
				scale2 = 1.00;
			}
			else if (courses[1] == "F")
			{
				scale2 = 0.00;
			}
			
			
			if (courses [2] == "A+")
			{
				scale3 = 4.00;
			}
			else if (courses[2] == "A")
			{
				scale3 = 4.00;
			}
			else if (courses[2] == "A-")
			{
				scale3 = 3.70;
			}
			else if (courses[2] == "B+")
			{
				scale3 = 3.30;
			}
			else if (courses[2] == "B")
			{
				scale3 = 3.00;
			}
			else if (courses[2] == "B-")
			{
				scale3 = 2.70;
			}
			else if (courses[2] == "C+")
			{
				scale3 = 2.30;
			}
			else if (courses[2] == "C")
			{
				scale3 = 2.00;
			}
			else if (courses[2] == "C-")
			{
				scale3 = 1.70;
			}
			else if (courses[2] == "D+")
			{
				scale3 = 1.30;
			}
			else if (courses[2] == "D")
			{
				scale3 = 1.00;
			}
			else if (courses[2] == "F")
			{
				scale3 = 0.00;
			}
			
			double sum = scale1 + scale2 + scale3;
			double calcGPA = sum/3;
			DecimalFormat df = new DecimalFormat("0.00");
	        String temp = df.format(calcGPA);
	        double decimalGPA = Double.parseDouble(temp);
	        Database.database.set(i).setGpa(decimalGPA);
		}
	}
}
