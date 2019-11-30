package com.br.codenation.Aplicacao.services;

import com.br.codenation.Aplicacao.contracts.Dto.CompanySalaryDto;
import com.br.codenation.Aplicacao.domain.entity.Company;
import javassist.NotFoundException;

import java.util.List;

public interface CompanyService {

	Company save(Company company);

	Boolean deleteById(Long id) throws NotFoundException;

    Company findById(Long companyId);

    List<Company> findByName(String nome);

    Long countCompanies();

    List<CompanySalaryDto> getAverageSalaryPerCompany();
}