package com.ali.smartdocsearch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ali.smartdocsearch.entity.Document;

public interface DocumentRepository extends JpaRepository<Document, Long> {
}