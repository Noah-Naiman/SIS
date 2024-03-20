public class DisplaySorted 
{
	public static void displaySortedList()
	{
		int counter = 1;
	
	for(int i = 0; i < Database.database.size(); i++)
	{
		System.out.println(counter + ") "Database.database.get(i).getFirstName() + Database.database.get(i).getLastName() + Database.database.get(i).getCourse1Name() + Database.database.get(i).getCourse1Letter() + Database.database.get(i).getCourse2Name() + Database.database.get(i).getCourse2Letter() + Database.database.get(i).getCourse3Name() + Database.database.get(i).getCourse3Letter());
	
	}
	
	
	}
	
	
	
	
	
	
	
	
}
