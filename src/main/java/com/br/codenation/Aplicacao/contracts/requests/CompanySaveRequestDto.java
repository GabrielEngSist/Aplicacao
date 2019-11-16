package com.br.codenation.Aplicacao.contracts.requests;

import com.br.codenation.Aplicacao.contracts.Dto.AddressDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CompanySaveRequestDto {
    private int vacancies;

    private String site;

    private String name;

    private String document;

    private int age;

    private AddressDto address;
}
