package br.com.study.bank.entity.customer.request;

import java.time.LocalDate;

public class CreationCustomerRequest {

    private String cpfCustomer;

    private String customerName;

    private LocalDate birthDate;

    private String birthCity;

    private String birthUf;

    private String cep;

    private String numberOfDistrict;

    private String complement;

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

    public String getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    public String getBirthUf() {
        return birthUf;
    }

    public void setBirthUf(String birthUf) {
        this.birthUf = birthUf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumberOfDistrict() {
        return numberOfDistrict;
    }

    public void setNumberOfDistrict(String numberOfDistrict) {
        this.numberOfDistrict = numberOfDistrict;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }
}
