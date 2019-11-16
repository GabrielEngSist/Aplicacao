package com.br.codenation.Aplicacao.services.impl;

import com.br.codenation.Aplicacao.services.CompanyService;
import com.br.codenation.Aplicacao.services.StatisticsService;
import com.br.codenation.Aplicacao.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StatisticsServiceImpl implements StatisticsService {

	private Logger logger = LoggerFactory.getLogger(StatisticsServiceImpl.class);
	private static CompanyService companyService = new CompanyServiceImpl();
	private static UserService userService = new UserServiceImpl();

	@Override
	public void imprimirMediaIdadePorEmpresa() {
		// TODO Auto-generated method stub
	}

	@Override
	public void imprimirEmpresaMenorCusto() {
		// TODO Auto-generated method stub

	}

	@Override
	public void imprimirTotalFolhaPorEmpresa() {
		// TODO Auto-generated method stub

	}

	@Override
	public void imprimirMediaSalarioPorEmpresa() {
		// TODO Auto-generated method stub

	}

	@Override
	public void imprimirMaiorSalarioGeral() {
		// TODO Auto-generated method stub

	}

	@Override
	public void imprimirMaiorSalarioPorEmpresa() {
		// TODO Auto-generated method stub

	}

}
