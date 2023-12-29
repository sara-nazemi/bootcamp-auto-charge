package com.example.bootcampautocharge.repositories;

import com.example.bootcampautocharge.models.entities.AutoChargeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutoChargeRepository extends JpaRepository<AutoChargeEntity,Long> {
}
