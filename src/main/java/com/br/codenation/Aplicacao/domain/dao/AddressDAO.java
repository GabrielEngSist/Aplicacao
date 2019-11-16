package com.br.codenation.Aplicacao.domain.dao;

import com.br.codenation.Aplicacao.domain.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressDAO extends JpaRepository<Address, Long> {

}