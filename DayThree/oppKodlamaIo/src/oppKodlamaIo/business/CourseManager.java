package oppKodlamaIo.business;

import java.util.ArrayList;
import java.util.List;

import oppKodlamaIo.core.loging.Logger;
import oppKodlamaIo.dataAccess.CourseDao;
import oppKodlamaIo.entities.Course;
import oppKodlamaIo.entities.Instructor;

public class CourseManager {
	private CourseDao courseDao;
	private Instructor instructor;
	private List<Course> courses;
	private List<Logger> loggers;

	public CourseManager(CourseDao courseDao, Instructor instructor, List<Logger> loggers) {
		this.courseDao = courseDao;
		this.instructor = instructor;
		this.courses = new ArrayList<Course>();
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {

		for (Course cours : courses) {
			if (cours.getCourseName().equals(course.getCourseName())) {
				throw new Exception("Ayný isimli birden fazla kurs ismi olmaz.");
			}
		}

		if (course.getCoursePrice() < 0) {
			throw new Exception("Kursun fiyati 0'dan küçük olamaz.");
		}

		course.setInstructorId(instructor.getId());
		courses.add(course);
		courseDao.add(course);

		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
		
	}
}
