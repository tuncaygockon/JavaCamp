package oopIntro;

public class Course {
	
	public Course() {
		System.out.println("Kurslar �a��r�ld�.");
	}
	
	public Course(int courseID, String courseName, String courseDescription, String coursePrice, String courseProgrammingLanguage) {
		this();
		
		this.courseID = courseID;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.coursePrice = coursePrice;
		this.courseProgrammingLanguage = courseProgrammingLanguage;
	}
	
	int courseID;
	String courseName;
	String courseDescription;
	String coursePrice;
	String courseProgrammingLanguage;

}
