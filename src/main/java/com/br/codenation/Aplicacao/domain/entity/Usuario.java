package com.br.codenation.Aplicacao.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "usuario")
public class Usuario {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome", nullable = false, length = 255)
    private String nome;

    @Column(name = "documento", nullable = false, length = 255)
    private String documento;

    @Column(name = "idade")
    private int idade;

    @Column(name = "login", nullable = false, length = 255)
    private String login;

    @Column(name = "senha", nullable = false, length = 255)
    private String senha;

    @ManyToOne
	@JoinColumn(name = "empresa_id")
    private Empresa empresa;

    @Column(name = "salario")
    private BigDecimal salario;

    @OneToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;
}
