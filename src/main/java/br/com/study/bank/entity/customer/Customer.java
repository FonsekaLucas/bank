package br.com.study.bank.entity.customer;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "customer")
public class Customer {

    @Id
    @Column(name = "customer_uid")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long customerUid;
    
    @Column(name = "cpf_customer")
    private String cpfCustomer;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "city_of_birth")
    private String cityOfBirth;

    @JoinColumn(name = "address_id", referencedColumnName = "address_uid")
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Address address;

    public Long getCustomerUid() {
        return customerUid;
    }

    public void setCustomerUid(Long customerUid) {
        this.customerUid = customerUid;
    }

    public String getCpfCustomer() {
        return cpfCustomer;
    }

    public void setCpfCustomer(String cpfCustomer) {
        this.cpfCustomer = cpfCustomer;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getCityOfBirth() {
        return cityOfBirth;
    }

    public void setCityOfBirth(String cityOfBirth) {
        this.cityOfBirth = cityOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
