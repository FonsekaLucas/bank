package br.com.study.bank.entity.customer;

import java.time.LocalDate;

public class Customer {

    private Long customerUid;
    private String cpfCustomer;
    private String customerName;
    private LocalDate birthDate;
    private String cityOfBirth;
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
