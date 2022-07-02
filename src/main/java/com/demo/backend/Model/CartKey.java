package com.demo.backend.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@AllArgsConstructor
@Data
@NoArgsConstructor
public class CartKey implements Serializable {

    @Column(name = "user_id")
    Long userId;

    @Column(name = "item_id")
    Long itemId;

}