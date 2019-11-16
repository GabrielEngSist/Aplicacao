package com.br.codenation.Aplicacao.services;

import com.br.codenation.Aplicacao.domain.entity.Address;

public interface AddressService {
    Address findById(Long id);
}
