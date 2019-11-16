package com.br.codenation.Aplicacao.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name="address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "city", nullable = false, length = 100)
    private String city;

    @Column(name = "zipCode", nullable = false, length = 8)
    private String zipCode;

    @Column(name = "street", nullable = false, length = 100)
    private String street;

    @Column(name = "number", nullable = false, length = 10)
    private int number;

    @Column(name = "state", nullable = false, length = 2)
    private String state;

    @Column(name = "country", nullable = false, length = 45)
    private String country;

}