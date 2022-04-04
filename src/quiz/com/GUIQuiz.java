package quiz.com;

import javax.swing.JOptionPane;

import quiz.com.generator.QuestionsGenerator;

public class GUIQuiz extends Quiz {

	public GUIQuiz(QuestionsGenerator generator) {
		super(generator);
	}

	@Override
	public void displayMessage(String message) {
		JOptionPane.showMessageDialog(null, message);
		
	}

	@Override
	public String retrieveAnswer(String pompt) {
		
		return JOptionPane.showInputDialog(pompt);
	}
}
