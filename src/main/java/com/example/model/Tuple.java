package com.example.model;

public class Tuple {
	private  int ilosc_wystapien;
	private String fileName;


	public Tuple(String fileName) {
		ilosc_wystapien++;
		this.fileName = fileName;
	
	}


	public int getIlosc_wystapien() {
		return ilosc_wystapien;
	}


	public void setIlosc_wystapien(int ilosc) {
		this.ilosc_wystapien= ilosc;
	}
	public void incrementlosc_wystapien() {
		this.ilosc_wystapien++;
	}

	public String getFileName() {
		return fileName;
	}


	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	
}
