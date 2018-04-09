package com.rghosh.question;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

@Entity
public class Question {
	
    //Unique question ID
	@Id
	private int questionUid;
	
	//Text of the question
	private String questionText;
	
	//Options to be displayed to as answer
	private List<String> options =new ArrayList<>();
	
	//Correct Option(s) as a question
	//may have more than one correct answer
	private List<String> correctOption = new ArrayList<>();
	
	//Tag list for question classification 
	private List<String> tags = new ArrayList<>();
	
	//Difficulty level of the question
	//ToDo - limit value to 1-10
	private int level;
	
	
	public Question() {
		
	}

	public Question(int questionUid, String questionText, List<String> options, List<String> correctOption,
			List<String> tags, int level) {
		super();
		this.questionUid = questionUid;
		this.questionText = questionText;
		this.options = options;
		this.correctOption = correctOption;
		this.tags = tags;
		this.level = level;
	}
	
	
	public int getQuestionUid() {
		return questionUid;
	}

	public void setQuestionUid(int questionUid) {
		this.questionUid = questionUid;
	}


	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}

	public List<String> getCorrectOption() {
		return correctOption;
	}

	public void setCorrectOption(List<String> correctOption) {
		this.correctOption = correctOption;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	

}
