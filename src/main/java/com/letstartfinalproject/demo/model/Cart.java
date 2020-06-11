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

    //@JsonManagedReference
    @JsonBackReference
    @OneToMany(mappedBy = "cart") // tas yra susietas butent su Furniture kur kuriam Clien client
    public List<Furniture> Furnitures = new ArrayList<>();

}
