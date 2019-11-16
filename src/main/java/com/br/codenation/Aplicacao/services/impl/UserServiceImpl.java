package com.br.codenation.Aplicacao.services.impl;

import com.br.codenation.Aplicacao.domain.dao.UserDAO;
import com.br.codenation.Aplicacao.domain.entity.Company;
import com.br.codenation.Aplicacao.domain.entity.User;
import com.br.codenation.Aplicacao.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO _usuario;

	@Override
	@Transactional
	public User save(User usuario) {
		return _usuario.save(usuario);
	}

	@Override
	@Transactional
	public Boolean deleteById(Long id) {
		_usuario.deleteById(id);
		return _usuario.findById(id).equals(null);
	}

	@Override
	public void changeCompany(User usuario, Company empresa) {
		_usuario.changeCompany(usuario.getId(), empresa.getId());
	}

	@Override
	public void changeName(User usuario, String nome) {
		_usuario.changeName(usuario.getId(), nome);
	}
}
