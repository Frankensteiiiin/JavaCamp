package oppKodlamaIo.dataAccess;

import oppKodlamaIo.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile veritabanına eğitmen eklendi :" 
				+ instructor.getInstructorFirstName() + " "
				+ instructor.getInstructorLastName());
	}

}
