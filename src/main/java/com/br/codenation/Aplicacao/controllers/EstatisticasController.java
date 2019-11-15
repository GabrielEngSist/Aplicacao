package com.br.codenation.Aplicacao.controllers;

import com.br.codenation.Aplicacao.services.EstatisticasService;
import com.br.codenation.Aplicacao.services.impl.EstatisticasServiceImpl;

public class EstatisticasController {
	public EstatisticasService estatisticasService = new EstatisticasServiceImpl();

	public void imprimirMaiorSalarioPorEmpresa() {
		estatisticasService.imprimirMaiorSalarioPorEmpresa();
	}

	public void imprimirMaiorSalarioGeral() {
		estatisticasService.imprimirMaiorSalarioGeral();		
	}

	public void imprimirMediaSalarioPorEmpresa() {
		estatisticasService.imprimirMediaSalarioPorEmpresa();		
	}

	public void imprimirTotalFolhaPorEmpresa() {
		estatisticasService.imprimirTotalFolhaPorEmpresa();
		
	}

	public void imprimirEmpresaMenorCusto() {
		estatisticasService.imprimirEmpresaMenorCusto();
		
	}

	public void imprimirMediaIdadePorEmpresa() {
		estatisticasService.imprimirMediaIdadePorEmpresa();
	}
}
