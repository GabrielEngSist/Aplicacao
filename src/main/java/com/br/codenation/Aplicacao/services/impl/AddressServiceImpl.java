package com.br.codenation.Aplicacao.services.impl;

import com.br.codenation.Aplicacao.domain.dao.AddressDAO;
import com.br.codenation.Aplicacao.domain.entity.Address;
import com.br.codenation.Aplicacao.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressDAO _addressRepository;

    public Address findById(Long id) {
        return _addressRepository
                .findById(id)
                .orElse(Address.builder().build());
    }
}
