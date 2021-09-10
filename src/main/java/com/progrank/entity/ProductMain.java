package com.progrank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductMain {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pid;
    private String productName;
    private double productPrice;
}
