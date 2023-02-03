package com.chirag.msscbrewery.web;

import com.chirag.msscbrewery.web.model.BeerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

public interface BeerService {
    BeerDTO getBeerById(UUID id);

}
