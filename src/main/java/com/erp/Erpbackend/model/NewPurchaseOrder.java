package com.erp.Erpbackend.model;

import java.time.LocalDate;

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
public class NewPurchaseOrder {
	@Id
	 @SequenceGenerator(name = "contractNo", sequenceName = "contractNo", initialValue = 9999)
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contractNo")
    private Integer contractNo;	
	private LocalDate date;
	private String address;
	private String name;
	private String url;
	private String specification;
	private String color;
	private Double price;
	private Double quantity;
	private Double Total;
	private String writeInWords;
}
