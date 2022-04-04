package quiz.com.generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import quiz.com.Questions;

public class CapitalCityQuestionsGenerator extends QuestionsGenerator {

	public CapitalCityQuestionsGenerator(int NUMBERQUESTIONS) {
		super(NUMBERQUESTIONS);

	}

	public ArrayList<Questions> generate() {
		HashMap<String, String> data = getData();
		ArrayList<String> countries = new ArrayList<String>(data.keySet());

		Random random = new Random();
		
		if (NUMBERQUESTIONS > data.size()) {
			throw new IllegalArgumentException(" Il n'y a que " + data.size() + " questions disponibles.");
		}

		ArrayList<Questions> questions = new ArrayList<>();

		for (int i = 0; i < NUMBERQUESTIONS; i++) {
			// Choisir un pays de maniere aleatoire
			int randomKey = random.nextInt(countries.size());
			String country = countries.get(randomKey);
			String capitale = data.get(country);

			countries.remove(randomKey); 
			
			String questionText = String.format("what is the capital of this country: %s?", country);
			questions.add(new Questions(questionText, capitale));

		}
		return questions;
	}

	private static HashMap<String, String> getData() {
		HashMap<String, String> data = new HashMap<>();
		data.put("Mali", "Bamako");
		data.put("Catalogne", "Barcelone");
		data.put("Senegal", "Dakar");
		data.put("Espagne", "Madrid");
		data.put("France", "Paris");
		data.put("Monaco", "Monaco");
		data.put("Italie", "Rome");
		data.put("Chine", "Pékin");
		data.put("Argentine", "Buenos Aires");
		data.put("Arabie Saoudite", "Riade");
		data.put("Perou", "Lima");
		data.put("Perou", "Lima");
		data.put("Allemagne", "Berlin");
		data.put("Guinée", "Conakry");
		data.put("Nigeria", "Lagos");
		data.put("Gambie", "Banjul");
		return data;

	}

}
