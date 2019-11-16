package com.br.codenation.Aplicacao.contracts.Dto;


import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    private Long id;

    private String name;

    private String document;

    private int age;

    private String login;

    private String password;

    private CompanyDto company;

    private BigDecimal salary;

    private AddressDto address;
}
