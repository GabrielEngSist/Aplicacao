package com.br.codenation.Aplicacao.resources.exception;

@SuppressWarnings("serial")
public class AplicacaoException extends RuntimeException{

	public AplicacaoException(String message){
		super("Ops! " + message);
	}
}
