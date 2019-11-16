package com.br.codenation.Aplicacao.domain.dao;

import com.br.codenation.Aplicacao.domain.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyDAO extends JpaRepository<Company, Long> {
    List<Company> findCompanyByName(String name);
}