package com.br.codenation.Aplicacao.controllers;

import com.br.codenation.Aplicacao.services.StatisticsService;
import com.br.codenation.Aplicacao.services.impl.StatisticsServiceImpl;

public class StatisticsController {
	public StatisticsService statisticsService = new StatisticsServiceImpl();

	public void imprimirMaiorSalarioPorEmpresa() {
		statisticsService.imprimirMaiorSalarioPorEmpresa();
	}

	public void imprimirMaiorSalarioGeral() {
		statisticsService.imprimirMaiorSalarioGeral();
	}

	public void imprimirMediaSalarioPorEmpresa() {
		statisticsService.imprimirMediaSalarioPorEmpresa();
	}

	public void imprimirTotalFolhaPorEmpresa() {
		statisticsService.imprimirTotalFolhaPorEmpresa();
		
	}

	public void imprimirEmpresaMenorCusto() {
		statisticsService.imprimirEmpresaMenorCusto();
		
	}

	public void imprimirMediaIdadePorEmpresa() {
		statisticsService.imprimirMediaIdadePorEmpresa();
	}
}
