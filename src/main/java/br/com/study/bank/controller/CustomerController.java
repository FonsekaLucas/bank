package br.com.study.bank.controller;

import br.com.study.bank.entity.customer.request.CreationCustomerRequest;
import br.com.study.bank.entity.customer.response.CreationCustomerResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    @PostMapping("/customer")
    public CreationCustomerResponse createAndSaveNewCustomer(CreationCustomerRequest request) {
        return null;
    }

}
