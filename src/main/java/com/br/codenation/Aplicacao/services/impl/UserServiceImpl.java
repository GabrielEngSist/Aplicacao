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
	UserDAO _userRepository;

	@Override
	@Transactional
	public User save(User usuario) {
		return _userRepository.save(usuario);
	}

	@Override
	@Transactional
	public Boolean deleteById(Long id) {
		_userRepository.deleteById(id);
		return _userRepository.findById(id).equals(null);
	}

	@Override
	public void changeCompany(User usuario, Company empresa) {
		_userRepository.changeCompany(usuario.getId(), empresa.getId());
	}

	@Override
	public void changeName(User usuario, String nome) {
		_userRepository.changeName(usuario.getId(), nome);
	}

	@Override
	public User findByUsername(String name) {
		return _userRepository.findByUsername(name);
	}
}
