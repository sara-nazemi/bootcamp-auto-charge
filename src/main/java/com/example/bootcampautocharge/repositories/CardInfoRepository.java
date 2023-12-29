package com.example.bootcampautocharge.repositories;

import com.example.bootcampautocharge.models.entities.CardInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardInfoRepository extends JpaRepository<CardInfoEntity,Long> {
}
