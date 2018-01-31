package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class TFIDF {
	
//	private void calculateTFIDF() {
//		for (String token : wordCount.keySet()) {
//			Map<Integer, Integer> docFreq = wordCount.get(token);
//			int tokenFreq = invertedIndex.get(token).size();
//			for (Integer doc : docFreq.keySet()) {
//				Integer count = docFreq.get(doc);
//				double w = 0.0;
//				if (count > 0) {
//					w = 1 + Math.log10(count);
//				}
//				Double value = w * Math.log10(documentCount/tokenFreq);
//				tfidf.setCount(token, doc, value);
//			}
//			
//		}
//	}
}
