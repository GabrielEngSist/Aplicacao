package com.br.codenation.Aplicacao.services.impl;

import com.br.codenation.Aplicacao.domain.dao.UsuarioDAO;
import com.br.codenation.Aplicacao.domain.entity.Empresa;
import com.br.codenation.Aplicacao.domain.entity.Usuario;
import com.br.codenation.Aplicacao.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	UsuarioDAO _usuario;

	@Override
	@Transactional
	public Usuario salvar(Usuario usuario) {
		return _usuario.save(usuario);
	}

	@Override
	@Transactional
	public Boolean deletar(Long id) {
		_usuario.deleteById(id);
		return _usuario.getOne(id) == null;
	}

	@Override
	public void alterarEmpresa(Usuario usuario, Empresa empresa) {
		_usuario.alterarEmpresa(usuario.getId(), empresa.getId());
	}

	@Override
	public void alterarNome(Usuario usuario, String nome) {
		_usuario.atualizarNome(usuario.getId(), nome);
	}
}
