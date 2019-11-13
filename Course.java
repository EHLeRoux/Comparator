package Easy;
public class Course  {

	String courseName; 
	int numberOfStudents; 
	String courseLecturer; 
	
	public Course (String courseName, int numberOfStudents, String courseLecturer) { 
		this.courseName = courseName; 
		this.numberOfStudents = numberOfStudents; 
		this.courseLecturer = courseLecturer;
	}

	public Course(Course course) {
		
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public String getCourseLecturer() {
		return courseLecturer;
	}

	public void setCourseLecturer(String courseLecturer) {
		this.courseLecturer = courseLecturer;
	}

	@Override
	public String toString() {
		return numberOfStudents + " " + courseName + " " +  courseLecturer;
	}

}
