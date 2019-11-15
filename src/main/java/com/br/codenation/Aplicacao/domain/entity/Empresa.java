package com.br.codenation.Aplicacao.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "empresa")
public class Empresa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "vagas")
    private int vagas;

	@Column(name = "site", nullable = false, length = 255)
    private String site;

	@OneToMany(mappedBy = "id", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Usuario> usuarios;

	@Column(name = "nome", nullable = false, length = 255)
    private String nome;

	@Column(name = "documento", nullable = false, length = 255)
    private String documento;

	@Column(name = "idade")
    private int idade;

    @OneToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;
}
