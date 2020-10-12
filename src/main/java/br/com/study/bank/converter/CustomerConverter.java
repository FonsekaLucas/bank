package br.com.study.bank.converter;

import br.com.study.bank.entity.customer.Customer;
import br.com.study.bank.entity.customer.request.CreationCustomerRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface CustomerConverter {

    @Mappings({
            @Mapping(target = "address.cep", source = "request.cep"),
            @Mapping(target = "address.district", source = "request.district"),
            @Mapping(target = "address.number", source = "request.number"),
            @Mapping(target = "address.complement", source = "request.complement"),
            @Mapping(target = "address.city", source = "request.city"),
            @Mapping(target = "address.uf", source = "request.uf")
    })
    Customer creationCustomerRequestToCustomer(CreationCustomerRequest request);

}
