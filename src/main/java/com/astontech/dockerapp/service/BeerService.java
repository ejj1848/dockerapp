package com.astontech.dockerapp.service;

import com.astontech.dockerapp.domain.Beer;

import java.util.List;
import java.util.Optional;

public interface BeerService {

    Optional<Beer> findBeerById(Long id);
    List<Beer> findAllBeers();
    Beer saveBeer(Beer beer);




}
