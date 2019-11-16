package com.br.codenation.Aplicacao.controllers;

import com.br.codenation.Aplicacao.contracts.requests.UserSaveRequestDto;
import com.br.codenation.Aplicacao.domain.entity.User;
import com.br.codenation.Aplicacao.services.impl.CompanyServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.br.codenation.Aplicacao.services.UserService;

public class UserController {
	
	protected UserService _userService;
	protected CompanyServiceImpl _companyService;
	Logger logger = LoggerFactory.getLogger(UserController.class);

	public void save(String name, String document, int age, Long companyId){

		UserSaveRequestDto empresa = UserSaveRequestDto.builder()
				.name(name)
				.document(document)
				.age(age)
				.companyId(companyId)
				.build();

		save(empresa);

	}

	public User save(UserSaveRequestDto userDto){
		User user = converterUsuarioDto(userDto);
		return _userService.save(user);
	}

	private User converterUsuarioDto(UserSaveRequestDto userDto) {
		return User.builder()
				.name(userDto.getName())
				.document(userDto.getDocument())
				.age(userDto.getAge())
				.company(_companyService.findById(userDto.getCompanyId()))
				.build();
	}
}
