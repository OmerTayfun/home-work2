package homeWorkTwo;

public class MainHw {

	public static void main(String[] args) {
		Course course1 = new Course(1, "C# Programlama", "Engin Demiroğ",48);
		Course course2 = new Course(2, "Java React", "Engin Demiroğ",15);
		

		Course[] courses = { course1, course2,};

		for (Course course : courses) {
			System.out.println(course.id + " " + course.courseName + " " + course.courseInstructor + " %"
					+ course.courseProcess);

		}

		Category category1 = new Category(1, "Programlama Dilleri");
		Category category2 = new Category(2, "Eğitmenler");

		CourseManager courseManager = new CourseManager();
		courseManager.joinThisCourse(course1);
		courseManager.joinThisCourse(course2);
		
		courseManager.removeFromCourse(course1);
		courseManager.removeFromCourse(course2);
	}

}
