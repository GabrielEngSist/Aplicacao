package com.br.codenation.Aplicacao.services;

import com.br.codenation.Aplicacao.domain.entity.Company;
import com.br.codenation.Aplicacao.domain.entity.User;

public interface UserService {

	User save(User user);

	Boolean deleteById(Long id);

	void changeCompany(User user, Company company);

	void changeName(User user, String name);

	User findByUsername(String name);
}