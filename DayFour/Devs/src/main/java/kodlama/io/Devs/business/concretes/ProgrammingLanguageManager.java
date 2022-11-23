package kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private ProgrammingLanguageRepository languageRepository;
	private List<ProgrammingLanguage> languages;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository languageRepository) {
		super();
		this.languageRepository = languageRepository;
		this.languages = new ArrayList<ProgrammingLanguage>();
		this.languages = languageRepository.getAll();
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		// TODO Auto-generated method stub
		return languageRepository.getAll();

	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {
		// TODO Auto-generated method stub

		for (ProgrammingLanguage language : languages) {
			//System.out.println(language.getName());

			if (language.getName().equalsIgnoreCase(programmingLanguage.getName())) {
				throw new Exception("Hata!! Aynı isimden birden fazla dil olamaz.");
			}

		}

		if (programmingLanguage.getName().isEmpty()) {
			throw new Exception("İsim Boş bırakılamaz.");
		}

		languageRepository.add(programmingLanguage);
		//System.out.println("Kayıt başırı ile tamamlandı : " + programmingLanguage.getName());

	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		// TODO Auto-generated method stub
		languageRepository.update(programmingLanguage);
//		System.out.println("İstek güncellendi : " + programmingLanguage.getId() + " " + programmingLanguage.getName());

//		for (ProgrammingLanguage language : languages) {
//			System.out.println(language.getName());
//		}
	}

	@Override
	public void delete(int id) {
		
//		ProgrammingLanguage language = languageRepository.get(id);
		languageRepository.delete(id);
//		System.out.println("istek başarılı. " + language.getName()+ " Silindi.");
	}

	
	@Override
	public ProgrammingLanguage get(int id) {
		// languageRepository.get(id);
		ProgrammingLanguage language = languageRepository.get(id);
//		System.out.println("istek başarılı : " + language.getName()+" Getirildi.");
		return language;
	}
}
