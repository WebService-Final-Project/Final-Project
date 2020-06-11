package com.letstartfinalproject.demo.Controller;

import com.letstartfinalproject.demo.cache.CartCache;
import com.letstartfinalproject.demo.cache.ClientCache;
import com.letstartfinalproject.demo.model.Cart;
import com.letstartfinalproject.demo.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/cache/cart")
@RestController
public class CartController {


    @Autowired
    CartCache cartCache;

    @GetMapping(value = "/{amount}")
    public Cart getCart(@PathVariable final String amount)
    {
        return cartCache.getCart(amount);
    }



}
