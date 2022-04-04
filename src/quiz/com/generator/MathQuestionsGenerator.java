package quiz.com.generator;

import java.util.ArrayList;
import java.util.Random;

import quiz.com.Questions;

public class MathQuestionsGenerator extends QuestionsGenerator {

	public MathQuestionsGenerator(int NUMBERQUESTIONS) {
		super(NUMBERQUESTIONS);

	}

	@Override
	public ArrayList<Questions> generate() {
		ArrayList<Questions> questions = new ArrayList<Questions>();
		Random random = new Random();
		char[] operators = { '+', '-', '*', '/' };

		for (int i = 0; i < NUMBERQUESTIONS; i++) {
			int nb1 = random.nextInt(15);
			int nb2 = random.nextInt(15) + 1;
			char operator = operators[random.nextInt(operators.length)];
			String questionText = String.format("%d %c %d = ?", nb1, operator, nb2);
			questions.add(new Questions(questionText, calculate(operator, nb1, nb2)));
		}

		return questions;
	}

	private String calculate(char operator, int nb1, int nb2) {
		String response = null;
		switch (operator) {
		case '+':
			response = String.valueOf(nb1 + nb2);
			break;
		case '-':
			response = String.valueOf(nb1 - nb2);
			break;
		case '*':
			response = String.valueOf(nb1 * nb2);
			break;
		case '/':
			response = String.valueOf(nb1 / nb2);
			break;
		}
		return response;

	}

}
