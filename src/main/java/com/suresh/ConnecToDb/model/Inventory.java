package com.suresh.ConnecToDb.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="InventoryAuto")
@Getter
@Setter
public class Inventory {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private long id;

    @Column(name="name")
    private String name;

    @Column(name="quantity")
    private long quantity;

    public Inventory(){}

    public Inventory(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return "Inventory [id=" + id + ", name=" + name + ", quantity=" +quantity + "]";
     }
}
