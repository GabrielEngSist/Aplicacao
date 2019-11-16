package com.br.codenation.Aplicacao.contracts.Dto;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddressDto {

    private Long id;

    private String city;

    private String zipCode;

    private String street;

    private int number;

    private String state;

    private String country;

}