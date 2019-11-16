package com.br.codenation.Aplicacao.controllers;

import com.br.codenation.Aplicacao.contracts.requests.CompanySaveRequestDto;
import com.br.codenation.Aplicacao.contracts.responses.CompanySaveResponseDto;
import com.br.codenation.Aplicacao.domain.entity.Company;
import com.br.codenation.Aplicacao.services.CompanyService;
import com.br.codenation.Aplicacao.services.impl.CompanyServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
	protected CompanyService companyService;
	Logger logger = LoggerFactory.getLogger(CompanyServiceImpl.class);

	public void save(String name, String document, int vacancies, int age, String site){

		CompanySaveRequestDto company = CompanySaveRequestDto.builder()
				.name(name)
				.document(document)
				.vacancies(vacancies)
				.age(age)
				.site(site)
				.build();

		save(company);
	}

	@PostMapping("/api/v1/empresa")
	public CompanySaveResponseDto save(@RequestBody CompanySaveRequestDto companyDto){
		try {
			Company company = convertCompanyDto(companyDto);
			company = companyService.save(company);

			return CompanySaveResponseDto.builder()
					.id(company.getId())
					.name(company.getName())
					.build();

		}catch (Exception ex){
			logger.error(ex.getMessage());
		}

		return null;
	}

	private Company convertCompanyDto(CompanySaveRequestDto companyDto) {

			return Company.builder()
					.vacancies(companyDto.getVacancies())
					.site(companyDto.getSite())
					.name(companyDto.getName())
					.document(companyDto.getDocument())
					.age(companyDto.getAge())
					.build();
	}
}
