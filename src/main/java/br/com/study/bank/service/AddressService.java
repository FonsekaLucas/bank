package br.com.study.bank.service;

import br.com.study.bank.entity.customer.Address;
import org.springframework.stereotype.Service;

@Service
public interface AddressService {

    Address getAddress(String cep);

}
