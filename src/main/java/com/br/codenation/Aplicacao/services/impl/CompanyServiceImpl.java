package com.br.codenation.Aplicacao.services.impl;

import com.br.codenation.Aplicacao.domain.dao.CompanyDAO;
import com.br.codenation.Aplicacao.domain.entity.Company;
import com.br.codenation.Aplicacao.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
    CompanyDAO _companyRepository;

	@Override
	@Transactional
	public Company save(Company empresa) {
		return _companyRepository.save(empresa);
	}

	@Override
	@Transactional
	public Boolean deleteById(Long id) {
		_companyRepository.deleteById(id);
		return findById(id).equals(null);
	}

	@Override
	public Company findById(Long idEmpresa) {
		return _companyRepository.findById(idEmpresa).orElse(null);
	}

	@Override
	public List<Company> findByName(String nome) {
		return _companyRepository.findCompanyByName(nome);
	}
}
