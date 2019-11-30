package com.br.codenation.Aplicacao.services.impl;

import com.br.codenation.Aplicacao.contracts.Dto.CompanySalaryDto;
import com.br.codenation.Aplicacao.domain.dao.CompanyDAO;
import com.br.codenation.Aplicacao.domain.entity.Company;
import com.br.codenation.Aplicacao.domain.entity.User;
import com.br.codenation.Aplicacao.services.CompanyService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
	public Boolean deleteById(Long id) throws NotFoundException {

		try {
			_companyRepository.deleteById(id);
			return true;
		} catch (Error e) {
			throw new NotFoundException("Empresa não encontrada com o Identificador" + id);
		}
	}

	@Override
	public Company findById(Long idEmpresa) {
		return _companyRepository.findById(idEmpresa).orElse(null);
	}

	@Override
	public List<Company> findByName(String nome) {
		return _companyRepository.findCompanyByName(nome);
	}

	@Override
	public Long countCompanies(){
		return _companyRepository.count();
	}

	@Override
	public List<CompanySalaryDto> getAverageSalaryPerCompany() {
		List<Company> companies =_companyRepository.findAll();

		return getCompanySalaryDtos(companies);
	}

	private List<CompanySalaryDto> getCompanySalaryDtos(List<Company> companies) {
		List<CompanySalaryDto> companiesSalary =
		companies.stream()
				.map( c -> CompanySalaryDto.builder()
						.averageSalary(getAverageSalary(c))
						.companyName(c.getName()).build())
				.collect(Collectors.toList());

		return companiesSalary;
	}

	private BigDecimal getAverageSalary(Company company) {
		BigDecimal averageSalary;
		List<User> users = company.getUsers();
		averageSalary = users.stream().map(
				u -> u.getSalary()
		).reduce(BigDecimal::add).orElse(new BigDecimal("0.00"));

		averageSalary = averageSalary.divide(new BigDecimal(users.size()));
		return averageSalary;
	}

}
