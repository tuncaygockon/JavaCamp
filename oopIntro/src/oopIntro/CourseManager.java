package oopIntro;

public class CourseManager {
	
	public void enrollCourse(Course course) {
		System.out.println(course.courseName + "'a Ba�ar�yla Kaydoldunuz!!");
	}	
	public void rollCall(Course course){
		System.out.println("Yoklaman�z Al�nm��t�r.");
	}
		public void sendComment(Course course, String comment){
		System.out.println("Yorumunuz Ba�ar�yla G�nderildi."+comment);
	}

}
