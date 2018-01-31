package com.example.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.service.DocumentService;

@Controller
public class DocumentController {
	
	@Autowired
	DocumentService documentService;
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	@ResponseBody
	public String addDocumentList() {
		List<String> files = new ArrayList<>();
		files.add("bla");
		documentService.addDocument(files);
		return "Added";
		// this data becomes of course as request parameters.
	}
	
	@RequestMapping(value="/dupa", method=RequestMethod.GET)
	@ResponseBody
	public String a() {
		System.out.println(documentService.getAll().size());
		return "Added";
		// this data becomes of course as request parameters.
	}
	
	@RequestMapping(value="/search", method=RequestMethod.GET)
	@ResponseBody
	public String serch() {
		Set<String> search = documentService.search("the");
		
	System.out.println(search.size());
		return "Added";
		// this data becomes of course as request parameters.
	}

}
