package com.br.codenation.Aplicacao.services;

import com.br.codenation.Aplicacao.domain.entity.Empresa;
import com.br.codenation.Aplicacao.domain.entity.Usuario;

public interface UsuarioService {
	Usuario salvar(Usuario usuario);
	Boolean deletar(Long id);
	void alterarEmpresa(Usuario usuario, Empresa empresa);
	void alterarNome(Usuario usuario, String nome);
}