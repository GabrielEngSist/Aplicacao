package com.br.codenation.Aplicacao.domain.dao;

import com.br.codenation.Aplicacao.domain.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioDAO extends JpaRepository<Usuario, Long> {
    @Query(value = "UPDATE usuario SET nome = :nome WHERE id = :id", nativeQuery = true)
    void atualizarNome(@Param("id") Long id, @Param("nome") String nome);

    @Query(value="UPDATE usuario SET empresa_id = :idEmpresa WHERE id = :id", nativeQuery = true)
    void alterarEmpresa(@Param("id") Long id, @Param("empresa_id") Long idEmpresa);
}
