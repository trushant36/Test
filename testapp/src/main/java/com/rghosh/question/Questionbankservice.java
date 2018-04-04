package com.rghosh.question;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class Questionbankservice {
	
	private List<Question> questionbank = Arrays.asList(new Question(1,"Question Text1", 
                                                               Arrays.asList("a","b","c","d"), 
                                                               Arrays.asList("a","d"),
                                                               Arrays.asList("comp sc","java", "REST"),
                                                               7),
			                                              new Question(2,"Question Text2", 
	                                                           Arrays.asList("a","b","c","d"), 
	                                                           Arrays.asList("a","c"),
	                                                           Arrays.asList("comp sc","java", "MVC"),
	                                                            7));

	public List<Question> getQuestionbank() {
		return questionbank;
	}

	public void setQuestionbank(List<Question> questionbank) {
		this.questionbank = questionbank;
	}
			
	public void addQuestion (Question question)		{
		questionbank.add(question);
		
	}
	
	public Question getQuestionbyId(int id) {
		
		return questionbank.get(id);
	}

}
