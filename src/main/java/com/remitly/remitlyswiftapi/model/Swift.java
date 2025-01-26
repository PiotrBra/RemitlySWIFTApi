package com.remitly.remitlyswiftapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Swift {


    @Id
    @GeneratedValue
    private Long id;
    private String countryISO2Code;
    private String swiftCode;
    private String bankName;
    private String address;
    private String countryName;
    private Boolean isHeadquarter;
    @OneToMany
    private List<Swift> branches;

    public Swift(String countryISO2Code, String swiftCode, String bankName, String address, String countryName, Boolean isHeadquarter) {
        this.countryISO2Code = countryISO2Code;
        this.swiftCode = swiftCode;
        this.bankName = bankName;
        this.address = address;
        this.countryName = countryName;
        this.isHeadquarter = isHeadquarter;
    }

    public Swift() {

    }
}
