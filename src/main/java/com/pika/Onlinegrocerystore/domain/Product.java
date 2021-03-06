package com.pika.Onlinegrocerystore.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.awt.*;
import java.sql.Date;

@Entity
@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private int inStock;
    private String productName;
//    private Category category;
    private int categoryId;
    private double price;
    //todo Category类和Image类在productMapper.xml中可能需要改

    // unit
    private String productDescription;
    private Image productPhoto;
    private int points;
    private Date bestBefore;
}
