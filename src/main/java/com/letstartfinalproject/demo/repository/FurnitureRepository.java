package com.letstartfinalproject.demo.repository;

import com.letstartfinalproject.demo.model.Client;
import com.letstartfinalproject.demo.model.Furniture;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="FURNITURE",path="furniture")
public interface FurnitureRepository extends CrudRepository<Furniture, Long> {
    Furniture findByName(String name);
}
