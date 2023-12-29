package com.example.bootcampautocharge.controllers;

import com.example.bootcampautocharge.models.dtoes.CardInfoDto;
import com.example.bootcampautocharge.models.entities.CardInfoEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cardinfo")
@Transactional(readOnly = true)
public class CardInfoController extends BaseController<CardInfoEntity, CardInfoDto,Long> {
}
