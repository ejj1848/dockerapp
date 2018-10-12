package com.astontech.dockerapp.repos;

import com.astontech.dockerapp.domain.Beer;
import org.springframework.data.repository.CrudRepository;

public interface BeerRepository extends CrudRepository<Beer, Long> {
}
