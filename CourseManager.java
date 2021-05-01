package homeWorkTwo;

public class CourseManager {

	public void joinThisCourse(Course course) {
		System.out.println(course.courseName+" Kursuna katılımınız başarı ile sağlandı!");
	}
	
	public void removeFromCourse(Course course) {
		System.out.println(course.courseName+" Kursunu başarıyla çıkardınız!");
	}
}
