package br.com.study.bank.service;

import br.com.study.bank.converter.CustomerConverter;
import br.com.study.bank.entity.customer.Customer;
import br.com.study.bank.entity.customer.request.CreationCustomerRequest;
import br.com.study.bank.entity.customer.response.CreationCustomerResponse;
import br.com.study.bank.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;

import static br.com.study.bank.utils.BankStringsUtils.NEW_CUSTOMER_SUCESS;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerConverter customerConverter;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private Properties properties;

    @Override
    public CreationCustomerResponse createCustomer(CreationCustomerRequest request) throws Exception {
        if (Objects.isNull(request)) {
            throw new Exception();
        }

        Customer customer = customerConverter.creationCustomerRequestToCustomer(request);
        customerRepository.saveAndFlush(customer);

        CreationCustomerResponse response = new CreationCustomerResponse();
        response.setMessage(properties.getProperty(NEW_CUSTOMER_SUCESS));


        return response;
    }
}
