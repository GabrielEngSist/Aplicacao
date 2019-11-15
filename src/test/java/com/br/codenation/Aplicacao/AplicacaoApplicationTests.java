package com.br.codenation.Aplicacao;

import com.br.codenation.Aplicacao.domain.entity.Empresa;
import com.br.codenation.Aplicacao.services.EmpresaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AplicacaoApplicationTests {

    @Autowired
     EmpresaService empresaService;

    @Test
    void insercaoEmpresaTeste(){

        Empresa empresa = Empresa.builder()
                .nome("Gabriel Oliveira Silva")
                .documento("123456")
                .idade(27)
                .site("www.gabrieloliveira.com.br")
                .vagas(10)
                .build();

        empresaService.salvar(empresa);

        assert (empresa.getId() > 0);
    }

}