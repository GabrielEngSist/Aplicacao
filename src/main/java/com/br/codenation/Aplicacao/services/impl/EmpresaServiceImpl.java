package com.br.codenation.Aplicacao.services.impl;

import com.br.codenation.Aplicacao.domain.dao.EmpresaDAO;
import com.br.codenation.Aplicacao.domain.entity.Empresa;
import com.br.codenation.Aplicacao.services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class EmpresaServiceImpl implements EmpresaService {

	@Autowired
	EmpresaDAO _empresa;

	@Override
	@Transactional
	public Empresa salvar(Empresa empresa) {
		return _empresa.save(empresa);
	}

	@Override
	@Transactional
	public Boolean deletar(Long id) {
		_empresa.deleteById(id);
		return recuperarEmpresa(id).equals(null);
	}

	@Override
	public Empresa recuperarEmpresa(Long idEmpresa) {

		return _empresa.getOne(idEmpresa);
	}
}
