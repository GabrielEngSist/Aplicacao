package com.br.codenation.Aplicacao.services.impl;

import com.br.codenation.Aplicacao.services.EmpresaService;
import com.br.codenation.Aplicacao.services.EstatisticasService;
import com.br.codenation.Aplicacao.services.UsuarioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EstatisticasServiceImpl implements EstatisticasService {

	private Logger logger = LoggerFactory.getLogger(EstatisticasServiceImpl.class);
	private static EmpresaService empresaService = new EmpresaServiceImpl();
	private static UsuarioService usuarioService = new UsuarioServiceImpl();

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
