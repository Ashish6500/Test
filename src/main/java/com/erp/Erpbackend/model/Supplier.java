package com.erp.Erpbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Entity
@Getter
@Setter
public class Supplier {
	@Id
	 @SequenceGenerator(name = "supplierId", sequenceName = "supplierId", initialValue = 9999)
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "supplierId")
    private Integer supllierId;
    private String company;
    private String firstName;
    private String lastName;
    private String jobTitle;
    private String mobile;
    private String phone;
    private String fax;
    private String email;
    private String address;
    private String paymentTerms;
}
