package com.br.codenation.Aplicacao.services.impl;

import com.br.codenation.Aplicacao.domain.dao.CompanyDAO;
import com.br.codenation.Aplicacao.domain.entity.Company;
import com.br.codenation.Aplicacao.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
    CompanyDAO _empresa;

	@Override
	@Transactional
	public Company save(Company empresa) {
		return _empresa.save(empresa);
	}

	@Override
	@Transactional
	public Boolean deleteById(Long id) {
		_empresa.deleteById(id);
		return findById(id).equals(null);
	}

	@Override
	public Company findById(Long idEmpresa) {
		return _empresa.findById(idEmpresa).orElse(null);
	}
}
