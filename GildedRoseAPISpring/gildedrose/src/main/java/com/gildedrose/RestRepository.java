package com.gildedrose;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:9091/items",maxAge = 3600)
@RepositoryRestResource
public interface RestRepository extends CrudRepository<Item, Long>{

}
