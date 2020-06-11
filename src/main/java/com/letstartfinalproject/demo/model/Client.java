package com.letstartfinalproject.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="CLIENT")
public class Client implements Serializable { // Garage




    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public String name;
    public String adress;

    public Client() {
    }


    public Client(String name,String adress) {
        this.name = name;
        this.adress = adress;
    }

    //@JsonManagedReference
    @JsonBackReference
    @OneToMany(mappedBy = "client") // tas yra susietas butent su Furniture kur kuriam Clien client
    public List<Furniture> Furnitures = new ArrayList<>();
    //  @RestResource(path = "libraryAddress", rel="address")

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", Furnitures=" + Furnitures +
                '}';
    }
}
