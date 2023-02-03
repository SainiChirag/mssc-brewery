package com.chirag.msscbrewery.web.controller;

import com.chirag.msscbrewery.web.BeerService;
import com.chirag.msscbrewery.web.model.BeerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    //recommended to not use field injection,
    /*
    The reasons why field injection is frowned upon are as follows:

     You cannot create immutable objects, as you can with constructor injection
      Your classes have tight coupling with your DI container and cannot be used outside of it
       Your classes cannot be instantiated (for example in unit tests) without reflection.
       You need the DI container to instantiate them, which makes your tests more like integration tests
     */
    private final BeerService beerService;

    public BeerController(@Autowired BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping({"/beerId"})
    public ResponseEntity<BeerDTO> getBeer(@PathParam("beerId") UUID beerId) {
    return new ResponseEntity<>(BeerDTO.builder().build(), HttpStatus.OK);

    }
}
