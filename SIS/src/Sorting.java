public class Sorting 
{
	public static void sortLastName()
	{
		for(int i = 0; i < Database.database.size(); i++)
		{
			if(Database.database.get(i).getLastName().substring(0,1).equals(Database.database.get(i+1).getLastName().substring(0,1)))
			{
				sortGPA();
			}
			else
			{
			
			}
		}
	}
	
	
	
	public static void sortGPA()
	{
		
	}
	
	public static void sortClassPeriod()
	{
		
	}
}
