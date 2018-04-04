package com.rghosh.question;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionbankController {
	
	@Autowired
	private Questionbankservice questionbankservice;
	
	@RequestMapping("/questions")
	public List<Question> getQuestions() {
		
		return questionbankservice.getQuestionbank();
	}
	
	@RequestMapping("/question/{id}")
	public Question getQuestion(@PathVariable int id) {
		
		return questionbankservice.getQuestionbyId(id);
	}
			
			
			
	
	

}
