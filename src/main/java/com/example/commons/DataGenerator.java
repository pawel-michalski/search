package com.example.commons;

import org.fluttercode.datafactory.impl.DataFactory;

public class DataGenerator {

	DataFactory df = new DataFactory();
	private final String suffix=".docx";

	public String getFakeStringValue() {
		return df.getFirstName()+suffix;
	}
	
	public String generateContent(){
		return df.getRandomWord()+""+df.getRandomWord();
	} 

}
