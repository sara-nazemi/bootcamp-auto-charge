package com.example.bootcampautocharge.repositories;

import com.example.bootcampautocharge.models.entities.TransactionLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionLogRepository extends JpaRepository<TransactionLogEntity,Long> {
}
