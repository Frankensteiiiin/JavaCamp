package kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

	List<ProgrammingLanguage> languages;

	public InMemoryProgrammingLanguageRepository() {
		languages = new ArrayList<ProgrammingLanguage>();
		languages.add(new ProgrammingLanguage(0, "Java"));
		languages.add(new ProgrammingLanguage(1, "C#"));
		languages.add(new ProgrammingLanguage(2, "C++"));
		languages.add(new ProgrammingLanguage(3, "C"));
		languages.add(new ProgrammingLanguage(4, "Python"));
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return languages;
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		languages.add(programmingLanguage);
	}

	@Override
	public void delete(int id) {
		languages.remove(id);
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		languages.set(programmingLanguage.getId(), programmingLanguage);
	}

	@Override
	public ProgrammingLanguage get(int id) {
		return languages.get(id);

	}

}
