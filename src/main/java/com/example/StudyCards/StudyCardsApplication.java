package com.example.StudyCards;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("api/v1/studycards")
public class StudyCardsApplication {

	private final StudyCardRepository studyCardRepository;

	public StudyCardsApplication(StudyCardRepository studyCardRepository) {
		this.studyCardRepository = studyCardRepository;
	}

	public static void main(String[] args) {
		System.out.println("Hello");
		SpringApplication.run(StudyCardsApplication.class, args);
	}

	List<StudyCard> cards = TestData.getTestDataset();

	@GetMapping
	public List<StudyCard> getFirstCardtitle() {
		return studyCardRepository.findAll();
	}

		record NewStudyCardRequest(
		String title,
		String description
	) {

	}

		record NewStudyCardRequestUpdate(
		Integer id,
		String title,
		String description
	) {

	}

	@PostMapping
	public void addStudyCard(@RequestBody NewStudyCardRequest request){
		StudyCard s = new StudyCard();
		s.setTitle(request.title);
		s.setDescription(request.description);
		studyCardRepository.save(s);
	}

	@DeleteMapping("{studyCardId}")
	public void deleteCard(@PathVariable("studyCardId") Integer id){
		//business logic
		studyCardRepository.deleteById(id);
	}

	@PutMapping("{studyCardId}")  
	private StudyCard updateCardUpdate(@RequestBody NewStudyCardRequestUpdate request) {  
		var old = studyCardRepository.findById(request.id);
		StudyCard oldStudyCard = null;
		if(old.isPresent()){
			oldStudyCard = old.get();
			oldStudyCard.title = request.title;
			oldStudyCard.description = request.description;
			studyCardRepository.save(oldStudyCard);
		}
		return oldStudyCard;  
	}  
}
