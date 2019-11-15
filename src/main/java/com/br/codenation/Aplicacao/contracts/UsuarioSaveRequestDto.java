package com.br.codenation.Aplicacao.contracts;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class UsuarioSaveRequestDto {

    private String nome;

    private String documento;

    private int idade;

    private String login;

    private String senha;

    private Long idEmpresa;

    private BigDecimal salario;

    private Long idEndereco;
}
