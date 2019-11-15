package com.br.codenation.Aplicacao.controllers;

import com.br.codenation.Aplicacao.contracts.EmpresaSaveRequestDto;
import com.br.codenation.Aplicacao.domain.entity.Empresa;
import com.br.codenation.Aplicacao.services.EmpresaService;
import com.br.codenation.Aplicacao.services.impl.EmpresaServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmpresaController {
	protected EmpresaService empresaService;
	Logger logger = LoggerFactory.getLogger(EmpresaServiceImpl.class);

	public void salvarEmpresa(String nome, String documento, int vagas, int idade, String site){

		EmpresaSaveRequestDto empresa = EmpresaSaveRequestDto.builder()
				.nome(nome)
				.documento(documento)
				.vagas(vagas)
				.idade(idade)
				.site(site)
				.build();

		salvarEmpresa(empresa);
	}

	public Empresa salvarEmpresa(EmpresaSaveRequestDto empresaDto){
		try {
			Empresa empresa = converterEmpresaDto(empresaDto);
			empresa = empresaService.salvar(empresa);
			logger.info("[Ok]Empresa {} salva com sucesso!", empresa.getNome());
		}catch (Exception ex){
			logger.error(ex.getMessage());
		}

		return null;
	}

	private Empresa converterEmpresaDto(EmpresaSaveRequestDto empresaDto) {

			return Empresa.builder()
					.vagas(empresaDto.getVagas())
					.site(empresaDto.getSite())
					.nome(empresaDto.getNome())
					.documento(empresaDto.getDocumento())
					.idade(empresaDto.getIdade())
					.build();
	}
}
