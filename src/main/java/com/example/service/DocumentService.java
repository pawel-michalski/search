package com.example.service;

import java.util.List;
import java.util.Set;

import com.example.model.Document;

public interface DocumentService {

	List<Document> addDocument(List<String> documentList);
	
	List<Document> getAll();
	
	public Set<String> search(String word);

}