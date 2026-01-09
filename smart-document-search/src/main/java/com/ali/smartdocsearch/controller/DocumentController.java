package com.ali.smartdocsearch.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ali.smartdocsearch.entity.Document;
import com.ali.smartdocsearch.service.DocumentService;

@RestController
@RequestMapping("/api/documents")
public class DocumentController {

    private final DocumentService documentService;

    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @PostMapping
    public ResponseEntity<Document> createDocument(@RequestBody Document document) {
        Document saved = documentService.saveDocument(document);
        return ResponseEntity.ok(saved);
    }

    @GetMapping
    public ResponseEntity<List<Document>> getAllDocuments() {
        return ResponseEntity.ok(documentService.getAllDocuments());
    }
    
    @GetMapping("/search")
    public ResponseEntity<List<Document>> searchDocuments(@RequestParam String keyword) {
    	return ResponseEntity.ok(documentService.searchDocuments(keyword));
    	
    }
    
    @GetMapping("/page")
    public ResponseEntity<Page<Document>> getDocumentsPaginated(
    		@RequestParam int page, 
    		@RequestParam int size) {
    	return ResponseEntity.ok(documentService.getDocumentsPaginated(page, size));
    }
}