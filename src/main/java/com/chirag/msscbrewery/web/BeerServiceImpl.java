package com.chirag.msscbrewery.web;

import com.chirag.msscbrewery.web.model.BeerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDTO getBeerById(UUID id) {
        return BeerDTO.builder()
                .id(UUID.randomUUID())
                .beerStyle("Strong")
                .beerName("Corona")
                .build();
    }
}
