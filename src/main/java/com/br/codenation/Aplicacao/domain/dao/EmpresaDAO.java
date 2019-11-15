package com.br.codenation.Aplicacao.domain.dao;

import com.br.codenation.Aplicacao.domain.entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpresaDAO extends JpaRepository<Empresa, Long> {

    @Query("SELECT e FROM Empresa e WHERE e.nome LIKE :nome ORDER BY e.nome")
    List<Empresa> recuperarEmpresaPorNome(@Param("nome") String nome);
}
