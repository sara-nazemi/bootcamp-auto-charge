package com.example.bootcampautocharge.controllers;

import com.example.bootcampautocharge.models.dtoes.AutoChargeDto;
import com.example.bootcampautocharge.models.entities.AutoChargeEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/autocharge")
@Transactional(readOnly = true)
public class AutoChargeController extends BaseController<AutoChargeEntity, AutoChargeDto,Long>{
}
