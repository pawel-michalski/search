package com.example.model;


public class Document {
	
	private static int id = 1;
	private final String DOCUMENT_NAME = "Document";
	private String name;
	private String documentContent;


	public Document(String documentContent) {
		this.name = DOCUMENT_NAME + id;
		this.documentContent = documentContent;
		id++;
		System.out.println("utworzono dokument " + name);
	}

	public static int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDocumentContent() {
		return documentContent;
	}

	public void setDocumentContent(String documentContent) {
		this.documentContent = documentContent;
	}

}
