package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)", 
				"2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.",
				"Ücretsiz","C#");
		
		Course course2 = new Course(2, "Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)", 
				"2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.",
				"Ücretsiz","Java");
		
		Course course3 = new Course(3, "Programlamaya Giriþ Ýçin Temel Kurs", 
				"PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantýðýný anlaþýlýr örneklerle öðrenin.",
				"Ücretsiz","Python, Java, C#");
		
		Course[] courses = {course1, course2, course3};
		
		for(int i=0; i<courses.length;i++){
			System.out.println(i+1 + ". Kurs Adý: "+courses[i].courseName);
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.enrollCourse(course1);
		courseManager.sendComment(course2, "Nice.");
		courseManager.rollCall(course2);
		

	}

}
