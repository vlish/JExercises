package com.softserveinc.ita.jexercises.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "USER_ANSWER")
public class UserAnswer extends BaseEntity {
	@Column(name = "ATTEMPT")
	private Attempt attempt;
	@Column(name = "ANSWER")
	private String answer;
	@Column(name = "IS_CORRECT")
	private boolean isCorrect;
	@Column(name = "QUESTION_ID")
	private Question question;

	public Attempt getAttempt() {
		return attempt;
	}

	public void setAttempt(Attempt attempt) {
		this.attempt = attempt;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public boolean isCorrect() {
		return isCorrect;
	}

	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
}