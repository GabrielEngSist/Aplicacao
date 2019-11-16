package com.br.codenation.Aplicacao.contracts.Dto;

import lombok.*;

import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CompanyDto {

    private Long id;

    private int vacancies;

    private String site;

    private List<UserDto> users;

    private String name;

    private String document;

    private int age;

    private AddressDto address;
}
