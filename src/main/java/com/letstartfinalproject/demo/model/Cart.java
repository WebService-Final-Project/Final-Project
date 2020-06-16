package com.letstartfinalproject.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="CART")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public String amount;
    public String currency;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }


    @JsonBackReference
   // @JsonManagedReference
    @OneToMany(mappedBy = "cart") // tas yra susietas butent su Furniture kur kuriam Clien client
    public List<Furniture> Furnitures = new ArrayList<>();

    public Cart(String amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Cart() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

}
