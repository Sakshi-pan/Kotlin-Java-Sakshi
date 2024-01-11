package IOC;
public class Students{
	String studentName;
	String studentCourse;
	
	public String getStudentName() {
		return studentName;
	}
	public String getStudentCourse() {
		return studentCourse;
	}
	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}
	public void setStudentCourse(String studentCourse) {
		this.studentCourse=studentCourse;
	
	}
	public String toString() {
		return studentName+" "+studentCourse;
	}
}