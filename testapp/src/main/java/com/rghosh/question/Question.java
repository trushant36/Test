package com.rghosh.question;

import java.util.ArrayList;
import java.util.List;

public class Question {
	
	public int getQuestionUid() {
		return questionUid;
	}

	public void setQuestionUid(int questionUid) {
		this.questionUid = questionUid;
	}
	private int questionUid;
	private String questionText;
	private List<String> options =new ArrayList<>();
	private List<String> correctOption = new ArrayList<>();
	private List<String> tags = new ArrayList<>();
	private int level;
	
	
	public Question() {
		super();
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
