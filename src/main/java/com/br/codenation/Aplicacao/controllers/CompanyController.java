package com.br.codenation.Aplicacao.controllers;

import com.br.codenation.Aplicacao.contracts.requests.CompanySaveRequestDto;
import com.br.codenation.Aplicacao.contracts.responses.CompanySaveResponseDto;
import com.br.codenation.Aplicacao.domain.entity.Address;
import com.br.codenation.Aplicacao.domain.entity.Company;
import com.br.codenation.Aplicacao.domain.entity.User;
import com.br.codenation.Aplicacao.services.CompanyService;
import com.br.codenation.Aplicacao.services.impl.CompanyServiceImpl;
import javassist.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.br.codenation.Aplicacao.resources.*;

import java.util.*;

@RestController
@RequestMapping("api/v1/company")
public class CompanyController {

	@Autowired
	protected CompanyService _companyService;

	Logger logger = LoggerFactory.getLogger(CompanyServiceImpl.class);

	@GetMapping
	public ResponseEntity findByName(@RequestParam String nome){

		List<Company> foundCompanies = _companyService.findByName(nome);

		return ResponseEntity
				.status(HttpStatus.FOUND)
				.body(foundCompanies);
	}

	@DeleteMapping("/{id}")
	// @ResponseStatus(HttpStatus.OK)
	public ResponseEntity deleteById(@PathVariable("id") Long companyId) throws NotFoundException {
		_companyService.deleteById(companyId);
		return ResponseEntity.ok("Empresa deletada com sucesso!");
	}

	@PostMapping
	public ResponseEntity save(@RequestBody CompanySaveRequestDto companyDto){
				Company company = convertCompanyDto(companyDto);
				company = _companyService.save(company);

				return ResponseEntity.status(HttpStatus.CREATED)
						.body(CompanySaveResponseDto.builder()
						.id(company.getId())
						.name(company.getName())
						.build());
	}

	private Company convertCompanyDto(CompanySaveRequestDto companyDto) {

			Address address = Address.builder()
					.city(companyDto.getAddress().getCity())
					.number(companyDto.getAddress().getNumber())
					.state(companyDto.getAddress().getState())
					.zipCode(companyDto.getAddress().getZipCode())
					.street(companyDto.getAddress().getStreet())
					.country(companyDto.getAddress().getCountry())
					.build();

			return Company.builder()
					.vacancies(companyDto.getVacancies())
					.site(companyDto.getSite())
					.name(companyDto.getName())
					.document(companyDto.getDocument())
					.age(companyDto.getAge())
					.users(new ArrayList<User>())
					.address(address)
					.build();
	}
}
