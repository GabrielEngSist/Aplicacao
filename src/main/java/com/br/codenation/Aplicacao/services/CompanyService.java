package com.br.codenation.Aplicacao.services;

import com.br.codenation.Aplicacao.domain.entity.Company;

public interface CompanyService {

	Company save(Company company);

	Boolean deleteById(Long id);

    Company findById(Long companyId);
}