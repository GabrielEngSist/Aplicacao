package com.br.codenation.Aplicacao.contracts.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompanySaveResponseDto {
    public Long id;
    public String name;
}
