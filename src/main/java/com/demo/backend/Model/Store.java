package com.demo.backend.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "store")
@Data
public class Store {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String area;

    @Column
    private String pincode;

    @Column
    private Double latitude;

    @Column
    private Double longitude;

}
