package com.kodluyoruz.homework.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
@Entity
@Table(name = "basket")
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Basket extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer quantity;



    @Column(name = "user_id")
    private Integer userId;

    @JoinColumn(name = "user_id", nullable = false, insertable = false, updatable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @Column(name = "product_id")
    private Integer productId;

    @JoinColumn(name = "product_id",nullable = false, insertable = false, updatable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;

}
