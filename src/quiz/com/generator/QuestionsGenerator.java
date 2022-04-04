package quiz.com.generator;

import java.util.ArrayList;

import quiz.com.Questions;

abstract public class QuestionsGenerator {
	 protected int NUMBERQUESTIONS;

		public QuestionsGenerator(int NUMBERQUESTIONS) {
			this.NUMBERQUESTIONS=NUMBERQUESTIONS;
		}
		public int getNUMBERQUESTIONS() {
			return NUMBERQUESTIONS;
		}
	abstract public ArrayList<Questions> generate() ;
}
