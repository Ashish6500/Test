package com.erp.Erpbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.Email;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Getter
@Setter
public class Customer {
	@Id
	 @SequenceGenerator(name = "custId", sequenceName = "custId", initialValue = 9999)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "custId")
	
    private Long custId;
    private String company;
    private String firstName;
    private String lastName;
    private String jobTitle;
    private String mobile;
    private String phone;
    private String fax;
    @Email
    private String email;
    private String address;
    private String paymentTerms;
    private String priceTerm;
}
