package com.br.codenation.Aplicacao.contracts.responses;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CompanySaveResponseDto {
    public Long id;
    public String name;
}
