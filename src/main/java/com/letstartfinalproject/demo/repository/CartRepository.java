package com.letstartfinalproject.demo.repository;

import com.letstartfinalproject.demo.model.Cart;
import com.letstartfinalproject.demo.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="CART",path="cart")
public interface CartRepository extends JpaRepository<Cart,Long> {
    Cart findByAmount(String amount);
}
