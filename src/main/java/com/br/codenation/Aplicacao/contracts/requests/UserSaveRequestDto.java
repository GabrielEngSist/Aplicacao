package com.br.codenation.Aplicacao.contracts.requests;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class UserSaveRequestDto {

    private String name;

    private String document;

    private int age;

    private String login;

    private String password;

    private Long companyId;

    private BigDecimal salary;

    private Long adressId;
}
