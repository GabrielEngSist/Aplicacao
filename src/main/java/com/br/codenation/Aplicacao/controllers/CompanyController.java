package com.br.codenation.Aplicacao.controllers;

import com.br.codenation.Aplicacao.contracts.Dto.CompanyDto;
import com.br.codenation.Aplicacao.contracts.requests.CompanySaveRequestDto;
import com.br.codenation.Aplicacao.contracts.responses.CompanyResponseDto;
import com.br.codenation.Aplicacao.contracts.responses.CompanySaveResponseDto;
import com.br.codenation.Aplicacao.domain.entity.Address;
import com.br.codenation.Aplicacao.domain.entity.Company;
import com.br.codenation.Aplicacao.domain.entity.User;
import com.br.codenation.Aplicacao.services.AddressService;
import com.br.codenation.Aplicacao.services.CompanyService;
import com.br.codenation.Aplicacao.services.impl.CompanyServiceImpl;
import com.sun.org.apache.xalan.internal.xsltc.dom.AdaptiveResultTreeImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("api/v1/company")
public class CompanyController {
	protected CompanyService companyService;
	protected AddressService addressService;
	Logger logger = LoggerFactory.getLogger(CompanyServiceImpl.class);

	@GetMapping
	public List<CompanyResponseDto> findByName(@RequestParam String nome){

		List<Company> foundCompanys = companyService.findByName(nome);

		return new ArrayList<CompanyResponseDto>();
	}

	@PostMapping
	public ResponseEntity save(@RequestBody CompanySaveRequestDto companyDto){
			try {

				Company company = convertCompanyDto(companyDto);
				company = companyService.save(company);

				return ResponseEntity.ok(CompanySaveResponseDto.builder()
						.id(company.getId())
						.name(company.getName())
						.build());

			}catch (Error error){

				return ResponseEntity
						.badRequest()
						.body("Falha ao salvar empresa: " + error.getMessage());

			}
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
