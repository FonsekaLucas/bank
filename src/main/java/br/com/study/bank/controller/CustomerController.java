package br.com.study.bank.controller;

import br.com.study.bank.entity.customer.request.CreationCustomerRequest;
import br.com.study.bank.entity.customer.response.CreationCustomerResponse;
import br.com.study.bank.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    @Autowired
    private CustomerServiceImpl customerService;

    @PostMapping("/customer")
    public CreationCustomerResponse createAndSaveNewCustomer(CreationCustomerRequest request) throws Exception {
        return customerService.createCustomer(request);
    }

}
