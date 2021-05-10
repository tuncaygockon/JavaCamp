package oopIntro;

public class CourseManager {
	
	public void enrollCourse(Course course) {
		System.out.println(course.courseName + "'a Baþarýyla Kaydoldunuz!!");
	}	
	public void rollCall(Course course){
		System.out.println("Yoklamanýz Alýnmýþtýr.");
	}
		public void sendComment(Course course, String comment){
		System.out.println("Yorumunuz Baþarýyla Gönderildi."+comment);
	}

}
