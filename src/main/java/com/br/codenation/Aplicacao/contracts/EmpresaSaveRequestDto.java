package com.br.codenation.Aplicacao.contracts;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmpresaSaveRequestDto {
    private int vagas;

    private String site;

    private String nome;

    private String documento;

    private int idade;

    private Long idEndereco;
}
