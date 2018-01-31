package com.example.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Document;
import com.example.repository.FakeDocumentRepository;





@Service
public class DocumentServiceImpl implements DocumentService {
	
	@Autowired
	FakeDocumentRepository documentRepository;
	
	
	
	/* (non-Javadoc)
	 * @see com.example.service.DocumentService#addDocument(java.util.List)
	 */
	@Override
	public List<Document> addDocument(List<String> documentList) {
		return documentRepository.addDocument(documentList);
		
	}

	@Override
	public List<Document> getAll() {
		// TODO Auto-generated method stub
		return documentRepository.getAll();
	}
	
	public Set<String> search(String word) {
		return documentRepository.search(word);
	}
	


}
