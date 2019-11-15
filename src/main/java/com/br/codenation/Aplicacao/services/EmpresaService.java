package com.br.codenation.Aplicacao.services;

import com.br.codenation.Aplicacao.domain.entity.Empresa;

public interface EmpresaService {

	Empresa salvar(Empresa empresa);

	Boolean deletar(Long id);

    Empresa recuperarEmpresa(Long idEmpresa);
}