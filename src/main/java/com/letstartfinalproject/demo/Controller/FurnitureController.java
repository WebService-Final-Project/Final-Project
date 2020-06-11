package com.letstartfinalproject.demo.Controller;

import com.letstartfinalproject.demo.cache.ClientCache;
import com.letstartfinalproject.demo.cache.FurnitureCache;
import com.letstartfinalproject.demo.model.Client;
import com.letstartfinalproject.demo.model.Furniture;
import com.letstartfinalproject.demo.repository.FurnitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping(value = "/cache/furnitures")
@RestController
public class FurnitureController {



    @Autowired
    FurnitureCache furnitureCache;

    @GetMapping(value = "/{name}")
    public Furniture getFurniture(@PathVariable final String name)
    {
        return furnitureCache.getFurniture(name);
    }




    /*
    @Autowired
    FurnitureRepository repository;

    @RequestMapping(value = "/testAllFurnitures", method = RequestMethod.GET)
    public Iterable<Furniture> getAllFurnitures(){
        return repository.findAll();
    }


    @RequestMapping(value = "/testIdFurniture", method = RequestMethod.GET, params = {"id"})
    public Furniture getFurniture(@RequestParam(value = "id") Long id) {
        Furniture furniture = new Furniture();
        Optional<Furniture> furnitureOpt = repository.findById(id);
        if(furnitureOpt.isPresent()) {
            furniture = furnitureOpt.get();
        }
        return furniture;
    }

     */

}
