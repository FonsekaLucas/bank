package br.com.study.bank.service;

import br.com.study.bank.entity.customer.Address;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Properties;

public class AddressServiceImpl implements AddressService{

    @Autowired
    private Properties properties;

    @Override
    public Address getAddress(String cep) {

        return null;
    }

}
