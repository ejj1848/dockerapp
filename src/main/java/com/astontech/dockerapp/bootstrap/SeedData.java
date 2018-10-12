package com.astontech.dockerapp.bootstrap;

import com.astontech.dockerapp.domain.Beer;
import com.astontech.dockerapp.service.BeerService;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SeedData {

    private final BeerService beerService;

    public SeedData(BeerService beerService) {
        this.beerService = beerService;
    }

    @EventListener
    public void onApplicationContextEvent(ContextRefreshedEvent event){

        Beer beer = new Beer(1L,"Surly Furious");
        Beer beer1 = new Beer(2L,"Black Stack 755");
        Beer beer2 = new Beer(3L,"Barrel Theory Rain Drops");

        beerService.saveBeer(beer);
        beerService.saveBeer(beer1);
        beerService.saveBeer(beer2);
    }
}
