package oppKodlamaIo.dataAccess;

import oppKodlamaIo.entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile veritabanýna kurs eklendi :" + course.getCourseName());
	}

}
