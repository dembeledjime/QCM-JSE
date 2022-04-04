package quiz.com;

import java.util.Scanner;

import quiz.com.generator.QuestionsGenerator;

public class ConsoleQuiz extends Quiz {
Scanner sc = new Scanner (System.in);

	public ConsoleQuiz(QuestionsGenerator generator) {
		super(generator);
	}

	@Override
	public void displayMessage(String message) {
		System.out.println(message);
		
	}

	@Override
	public String retrieveAnswer(String pompt) {
		displayMessage(pompt);
		return sc.nextLine();
	}
}
