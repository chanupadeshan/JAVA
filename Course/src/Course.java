
public class Course extends Student {
	String coursename;

	public Course(String name, int age, String coursename) {
		super(name, age);
		this.coursename = coursename;
	}
	
	public void displayCourseInfo() {
		displayInfo();
		System.out.println("Course name is: "+coursename+"\n");
	}
}
