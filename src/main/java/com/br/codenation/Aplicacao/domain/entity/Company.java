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
@Entity(name = "company")
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "vacancies")
    private int vacancies;

	@Column(name = "site", nullable = false, length = 255)
    private String site;

	@OneToMany(mappedBy = "id", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<User> users;

	@Column(name = "name", nullable = false, length = 255)
    private String name;

	@Column(name = "document", nullable = false, length = 255)
    private String document;

	@Column(name = "age")
    private int age;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    private Address address;
}
