package com.ali.smartdocsearch.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.ali.smartdocsearch.entity.Document;
import com.ali.smartdocsearch.repository.DocumentRepository;


@Service
public class DocumentService {

	private static final Logger logger = LoggerFactory.getLogger(DocumentService.class);
	
	private final DocumentRepository repository;

	public DocumentService(DocumentRepository repository) {
		this.repository = repository;
	}

	public Document saveDocument(Document document) {
		logger.info("Saving document: {}", document.getTitle());
		return repository.save(document);
	}

	public List<Document> getAllDocuments() {
		logger.info("Fetching all documents");
		return repository.findAll();
	}
	
	public List<Document> searchDocuments(String keyword) {
		logger.info("Searching documents with keyword: {}", keyword);
		return repository.findByTitleContainingIgnoreCase(keyword);
	}
}
