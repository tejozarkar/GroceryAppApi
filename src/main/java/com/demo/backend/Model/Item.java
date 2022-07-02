package com.demo.backend.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "item")
@Data
public class Item {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private Integer mrp;

    @Column
    private Integer discountPercent;

    @Column
    private Integer availableQuantity;

    @Column
    private Integer discountedSellingPrice;

    @Column
    private Integer weightInGms;

    @Column
    private Boolean outOfStock;

    @Column
    private Integer quantity;

}
