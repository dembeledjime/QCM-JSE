package quiz.com;

import quiz.com.generator.QuestionsGenerator;
import quiz.com.utils.TimeConverter;

abstract public class Quiz {
	private QuestionsGenerator generator;
	private int score;
	private long timeElapsed;
	private boolean done = false;

	public Quiz(QuestionsGenerator generator) {
		this.generator = generator;
	}

	abstract public void displayMessage(String message);

	abstract public String retrieveAnswer(String pompt);

	public void start() {
		try {
			long startTime = System.currentTimeMillis();

			for (Questions questions : generator.generate()) {
				String userAnswer = retrieveAnswer(questions.getText());

				if (userAnswer.equalsIgnoreCase(questions.getResponse())) {
					score++;
					displayMessage("Bonne reponse! ");
				} else {
					displayMessage("Oops!. Mauvaise reponse! \n La bonne reponse était " + questions.getResponse());

				}
			}
			done = true;
			long endTime = System.currentTimeMillis();

			timeElapsed = endTime - startTime;
		} catch (IllegalArgumentException e) {
			done = false;
			System.out.println(e.getMessage());
		}
	}

	public void displayResults() {
		if (done) {
			displayScore();
			displayTimeElapsed();
		}

	}

	private void displayTimeElapsed() {
		displayMessage(String.format("Le temps ecoulé est de %d secondes pour repondre aux %d questions",
				TimeConverter.toSeconds(timeElapsed), generator.getNUMBERQUESTIONS()));

	}

	private void displayScore() {
		displayMessage(String.format("Votre score final est de %d/%d.", score, generator.getNUMBERQUESTIONS()));

	}

}
