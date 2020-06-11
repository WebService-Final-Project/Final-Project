package com.letstartfinalproject.demo.Controller;



import com.letstartfinalproject.demo.cache.ClientCache;
import com.letstartfinalproject.demo.model.Client;
import com.letstartfinalproject.demo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RequestMapping(value = "/cache/clients")
@RestController
public class ClientController {

  //  @Autowired
   // ClientRepository repository;


    @Autowired
    ClientCache clientsCache;

    @GetMapping(value = "/{name}")
    public Client getClient(@PathVariable final String name)
    {
        return clientsCache.getClient(name);
    }



  /*@RequestMapping(value = "/testAllClients", method = RequestMethod.GET)
  public Iterable<Client> getAllClients(){
      return repository.findAll();
  }


    @RequestMapping(value = "/testIdClient", method = RequestMethod.GET, params = { "id" })
    public Client getClient(@RequestParam(value = "id") Long id) {
        Client client = new Client();
        Optional<Client> clientOpt = repository.findById(id);
        if(clientOpt.isPresent()) {
            client = clientOpt.get();
        }
        return client;
    }*/
}
