package com.br.codenation.Aplicacao.controllers;

import com.br.codenation.Aplicacao.contracts.UsuarioSaveRequestDto;
import com.br.codenation.Aplicacao.domain.entity.Usuario;
import com.br.codenation.Aplicacao.services.impl.EmpresaServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.br.codenation.Aplicacao.services.UsuarioService;
import com.br.codenation.Aplicacao.services.impl.UsuarioServiceImpl;

public class UsuarioController {
	
	protected UsuarioService _usuarioService;
	protected EmpresaServiceImpl _empresaService;
	Logger logger = LoggerFactory.getLogger(UsuarioServiceImpl.class);

	public void salvarUsuario(String nome, String documento, int idade, Long idEmpresa){

		UsuarioSaveRequestDto empresa = UsuarioSaveRequestDto.builder()
				.nome(nome)
				.documento(documento)
				.idade(idade)
				.idEmpresa(idEmpresa)
				.build();

		salvarUsuario(empresa);
	}

	public Usuario salvarUsuario(UsuarioSaveRequestDto usuarioDto){
		try{
			Usuario usuario = converterUsuarioDto(usuarioDto);
			return _usuarioService.salvar(usuario);
		}catch(Exception ex){
			logger.error("!Falha ao salvar empresa.Erro:\n{}",ex.getMessage());
		}

		return null;
	}

	private Usuario converterUsuarioDto(UsuarioSaveRequestDto usuarioDto) {
		return Usuario.builder()
				.nome(usuarioDto.getNome())
				.documento(usuarioDto.getDocumento())
				.idade(usuarioDto.getIdade())
				.empresa(_empresaService.recuperarEmpresa(usuarioDto.getIdEmpresa()))
				.build();
	}

//	public UsuarioController() {
//		this.usuarioService = new UsuarioServiceImpl();
//	}
//
//	public List<String> pesquisarUsuario(int idEmpresa,String nomeUsuario,String documento,int idade){
//		List<Usuario> usuarios = this.usuarioService.pesquisarUsuario(idEmpresa, nomeUsuario, documento, idade);
//
//		return usuarios.stream()
//				   .map(usuario -> "Usuario:" + usuario.getNome() + " - Empresa:" + usuario.getEmpresa().getNome())
//				   .collect(Collectors.toList());
//	}
//
//	public void inserirUsuario(String nome, String documento, int idade, String login, String senha, Empresa empresa, BigDecimal salario) {
//
//		try {
//			if (this.usuarioService.salvarUsuario(0, nome, documento, idade, login, senha, empresa, salario, new Endereco())) {
//				logger.info("[Ok]Usuario " + nome + " salvo com sucesso!");
//			}
//		} catch (Exception e) {
//			logger.error(e.getMessage());
//		}
//	}
}
