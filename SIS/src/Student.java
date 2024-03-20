
public class Student {
	private String firstName;
	private String lastName;
	private double gpa;
	
	private String course1Name;
	private String course2Name;
	private String course3Name;
	private String course1Letter;
	private String course2Letter;
	private String course3Letter;
	
	public Student (String f, String l, double g, String c1N, String c2N, String c3N, String c1L, String c2L, String c3L)
	{
		firstName = f;
		lastName = l;
		gpa = g;
		course1Name = c1N;
		course2Name = c2N;
		course3Name = c3N;
		course1Letter = c1L;
		course2Letter = c2L;
		course3Letter = c3L;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getCourse1Name() {
		return course1Name;
	}

	public void setCourse1Name(String course1Name) {
		this.course1Name = course1Name;
	}

	public String getCourse2Name() {
		return course2Name;
	}

	public void setCourse2Name(String course2Name) {
		this.course2Name = course2Name;
	}

	public String getCourse3Name() {
		return course3Name;
	}

	public void setCourse3Name(String course3Name) {
		this.course3Name = course3Name;
	}

	public String getCourse1Letter() {
		return course1Letter;
	}

	public void setCourse1Letter(String course1Letter) {
		this.course1Letter = course1Letter;
	}

	public String getCourse2Letter() {
		return course2Letter;
	}

	public void setCourse2Letter(String course2Letter) {
		this.course2Letter = course2Letter;
	}

	public String getCourse3Letter() {
		return course3Letter;
	}

	public void setCourse3Letter(String course3Letter) {
		this.course3Letter = course3Letter;
	}


	
// TESTING FOR HOMEWORK 

	
}
