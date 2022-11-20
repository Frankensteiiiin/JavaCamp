package oppKodlamaIo.dataAccess;

import oppKodlamaIo.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {

		System.out.println("JDBC ile veritabanýna eðitmen eklendi : " 
		+ instructor.getInstructorFirstName() + instructor.getInstructorLastName());
		
	}

}
