package com.example.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.example.commons.DataGenerator;
import com.example.model.Document;
import com.example.model.Sign;
import com.example.model.Tuple;

@Repository
public class FakeDocumentRepository {

	private List<Document> documentList = new ArrayList<>();

	Map<String, Sign> listOfSigns = new HashMap<String, Sign>();
	
	Map<String, Integer> numberWordsInDocument = new HashMap<>();

	@PostConstruct
	private void initList() {
		List<String> list = new ArrayList<>();
		list.add("the brown fox jumped over the brown dog");
		list.add("the lazy brown dog sat in the corner");
		list.add("the red fox bit the lazy dog the the");
		addDocument(list);
	}

	public List<Document> addDocument(List<String> incomingList) {

		List<Document> listToAdd = new ArrayList<>();
		for (int i = 0; i < incomingList.size(); i++) {
			//
			// if(incomingList.get(i).isEmpty()) {
			// incomingList.get(i) = genarateFakeValues();
			// }
			Document temp = new Document(incomingList.get(i));
			countIndexexForNewFile(temp);
			listToAdd.add(temp);

			temp = null;
		}
		documentList.addAll(listToAdd);

		return documentList;
	}

	public void countIndexexForNewFile(Document document) {
		indexFile(document);
	}

	public List<Document> getAll() {
		return documentList;
	}

	private void countWordsInDocument(Document document) {
		Integer integer = numberWordsInDocument.get(document.getName());
		numberWordsInDocument.put(document.getName(), integer++);
	}
	
	public void indexFile(Document document) {
		 System.out.println("indexuje " + document.getName() );
		for (String _word : document.getDocumentContent().split("\\W+")) {
			countWordsInDocument(document);
			String word = _word.toLowerCase();
            System.out.println("słowo " + word );
			Sign sign = listOfSigns.get(word);
			// niue ma jeszcze , to bedzie pierwszy wpis
			if (sign == null) {
                System.out.println("jest pusty Tuple dla słowa  " + word);
				// tu chyba sety trzeba zrobic
				//List<Tuple> pliki = new ArrayList<>();
				Map<String, Tuple> mapOfTuples = new HashMap<String, Tuple>();
				mapOfTuples.put(document.getName(), new Tuple(document.getName()));
				//pliki.add(new Tuple(document.getName()));
				Sign s = new Sign(mapOfTuples);
				listOfSigns.put(word, s);

			} else {
				
				
				Map<String, Tuple> mapOfTuples = sign.getMapOfTuples();
				Tuple tuple = mapOfTuples.get(document.getName());
				//nie ma w wykazie plików, dodaje
				if(tuple==null) {
					Tuple temp= new Tuple(document.getName());
					mapOfTuples.put(document.getName(), temp);
					sign.incremet();
				} else {
					tuple.incrementlosc_wystapien();
					sign.incremet();
				}
				

			}

			// nie ma jeszcze

		}
	}

	public Set<String> search(String w) {

		List<String> words = new ArrayList<>();
		words.add(w);
		Set<String> answer = new HashSet<String>();

		for (String _word : words) {

			String word = _word.toLowerCase();

			Sign sign = listOfSigns.get(word);
			if (sign != null) {
				//List<Tuple> listOfTuples = sign.getListOfTuples();
				Map<String, Tuple> mapOfTuples = sign.getMapOfTuples();
				for(Map.Entry<String, Tuple> entry : mapOfTuples.entrySet()) {
						//answer.add(entry.getFileName()+" "+t.getIlosc_wystapien());
						answer.add(entry.getValue().getFileName() + " "+entry.getValue().getIlosc_wystapien());
				}
				}
				
			

			
			for (String f : answer) {

				System.out.print(" " + f);
			}
			System.out.println("");
		}
		return answer;

	}

}
