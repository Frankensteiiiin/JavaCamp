package oppKodlamaIo.dataAccess;

import oppKodlamaIo.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {

		System.out.println("JDBC ile veritaban�na e�itmen eklendi : " 
		+ instructor.getInstructorFirstName() + instructor.getInstructorLastName());
		
	}

}
