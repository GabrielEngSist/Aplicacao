package com.br.codenation.Aplicacao.domain.dao;

import com.br.codenation.Aplicacao.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<User, Long> {
    @Query("UPDATE User u SET u.name = :name WHERE u.id = :id")
    void changeName(@Param("id") Long id, @Param("name") String name);

    @Query("UPDATE User u SET u.company.id = :idEmpresa WHERE u.id = :id")
    void changeCompany(@Param("id") Long id, @Param("company_id") Long companyId);
}
