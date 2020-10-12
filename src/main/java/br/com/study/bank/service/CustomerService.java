package br.com.study.bank.service;

import br.com.study.bank.entity.customer.request.CreationCustomerRequest;
import br.com.study.bank.entity.customer.response.CreationCustomerResponse;

public interface CustomerService {

    CreationCustomerResponse createCustomer(CreationCustomerRequest request) throws Exception;

}
