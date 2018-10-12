package com.astontech.dockerapp.service.IMPL;

import com.astontech.dockerapp.domain.Beer;
import com.astontech.dockerapp.repos.BeerRepository;
import com.astontech.dockerapp.service.BeerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BeerServiceIMPL implements BeerService {

    private BeerRepository beerRepository;

    public BeerServiceIMPL(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public Optional<Beer> findBeerById(Long id) {
        return beerRepository.findById(id);
    }

    @Override
    public List<Beer> findAllBeers() {
        return (List<Beer>) beerRepository.findAll();
    }

    @Override
    public Beer saveBeer(Beer beer) {
        return  beerRepository.save(beer);
    }
}
