package com.example.model;

import java.util.HashMap;
import java.util.Map;

public class Sign {

	private  int total_occurance;
	Map<String, Tuple> mapOfTuples = new HashMap<String, Tuple>();

	public Sign( Map<String, Tuple> listOfTuples) {
		total_occurance++;
		this.mapOfTuples = listOfTuples;
	}

	public int getFrequency() {
		return total_occurance;
	}

	public void setFrequency(int f) {
		total_occurance = f;
	}
	
	public void incremet() {
		this.total_occurance++;
	}

	public Map<String, Tuple> getMapOfTuples() {
		return mapOfTuples;
	}

	public void setMapOfTuples(Map<String, Tuple> mapOfTuples) {
		this.mapOfTuples = mapOfTuples;
	}


	

}
