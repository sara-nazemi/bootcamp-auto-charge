package com.example.bootcampautocharge.services;

import com.example.bootcampautocharge.models.documents.ExceptionDocument;
import com.example.bootcampautocharge.repositories.ExceptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExceptionServiceImpl implements ExceptionService{
    private final ExceptionRepository exceptionRepository;

    @Autowired
    public ExceptionServiceImpl(ExceptionRepository exceptionRepository) {
        this.exceptionRepository = exceptionRepository;
    }

    @Override
    public void saveException(ExceptionDocument exceptionDocument) {
        exceptionRepository.save(exceptionDocument);
    }

}
