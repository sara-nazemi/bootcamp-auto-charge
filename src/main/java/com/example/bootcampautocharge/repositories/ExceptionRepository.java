package com.example.bootcampautocharge.repositories;

import com.example.bootcampautocharge.models.documents.ExceptionDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExceptionRepository extends MongoRepository<ExceptionDocument,String> {
}
