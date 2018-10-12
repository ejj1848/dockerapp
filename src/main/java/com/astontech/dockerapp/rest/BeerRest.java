package com.astontech.dockerapp.rest;

import com.astontech.dockerapp.domain.Beer;
import com.astontech.dockerapp.service.BeerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/beer")
public class BeerRest {


   private final BeerService beerService;


    public BeerRest(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/")
    public List<Beer> findAllTheBeers(){
        return beerService.findAllBeers();
    }

    @GetMapping("/{id}")
    public Optional<Beer> findByById(@PathVariable Long id){
        return beerService.findBeerById(id);
    }

}
