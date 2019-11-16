package com.br.codenation.Aplicacao.contracts.requests;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CompanySaveRequestDto {
    private int vacancies;

    private String site;

    private String name;

    private String document;

    private int age;

    private Long adressId;
}
