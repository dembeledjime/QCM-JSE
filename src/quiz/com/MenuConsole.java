 package quiz.com;

import quiz.com.generator.CapitalCityQuestionsGenerator;
import quiz.com.generator.MathQuestionsGenerator;

public class MenuConsole {

	public static void main(String[] args) {
		Quiz quiz = new GUIQuiz(new MathQuestionsGenerator(2));
   		quiz.start();
		quiz.displayResults();

	} 

}
