package oppKodlamaIo;

import java.util.ArrayList;
import java.util.List;

import oppKodlamaIo.business.*;
import oppKodlamaIo.core.loging.*;
import oppKodlamaIo.dataAccess.*;
import oppKodlamaIo.entities.*;


public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		List<Logger> loggers = new ArrayList<Logger>();
		loggers.add(new DatabaseLogger());
		loggers.add(new FileLogger());
		loggers.add(new MailLogger());

		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setInstructorFirstName("Murat");
		instructor.setInstructorLastName("Topcu");

		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(),loggers);
		instructorManager.add(instructor);

		Course course = new Course();
		course.setId(1);
		course.setCourseName("Java");
		course.setCoursePrice(10);

		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), instructor,loggers);
		courseManager.add(course);

		Category category = new Category();
		category.setId(1);
		category.setName("Programlama");

		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Grakfik tasarým");

//		Category category3 = new Category();
//		category3.setId(3);
//		category3.setName("Programlama");

		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
		categoryManager.add(category);
		categoryManager.add(category2);
//		categoryManager.add(category3);

	}

}
