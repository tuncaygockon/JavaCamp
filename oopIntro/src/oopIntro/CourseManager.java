package oopIntro;

public class CourseManager {
	
	public void enrollCourse(Course course) {
		System.out.println(course.courseName + "'a Başarıyla Kaydoldunuz!!");
	}	
	public void rollCall(Course course){
		System.out.println("Yoklamanız Alınmıştır.");
	}
		public void sendComment(Course course, String comment){
		System.out.println("Yorumunuz Başarıyla Gönderildi."+comment);
	}

}
