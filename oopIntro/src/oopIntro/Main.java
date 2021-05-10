package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)", 
				"2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.",
				"�cretsiz","C#");
		
		Course course2 = new Course(2, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)", 
				"2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.",
				"�cretsiz","Java");
		
		Course course3 = new Course(3, "Programlamaya Giri� ��in Temel Kurs", 
				"PYTHON, JAVA, C# gibi t�m programlama dilleri i�in temel programlama mant���n� anla��l�r �rneklerle ��renin.",
				"�cretsiz","Python, Java, C#");
		
		Course[] courses = {course1, course2, course3};
		
		for(int i=0; i<courses.length;i++){
			System.out.println(i+1 + ". Kurs Ad�: "+courses[i].courseName);
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.enrollCourse(course1);
		courseManager.sendComment(course2, "Nice.");
		courseManager.rollCall(course2);
		

	}

}
