package oppKodlamaIo.dataAccess;

import oppKodlamaIo.entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {

		System.out.println("JDBC ile veritabanýna kurs eklendi : "+ course.getCourseName());
		
	}

}
