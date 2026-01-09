package com.ali.smartdocsearch.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ali.smartdocsearch.entity.Document;

public interface DocumentRepository extends JpaRepository<Document, Long> {
	List<Document> findByTitleContainingIgnoreCase(String keyword);
}