package com.erp.Erpbackend.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

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
public class OrderContract {
	@Id
	 @SequenceGenerator(name = "orderId", sequenceName = "orderId", initialValue = 9999)
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "orderId")
    private Integer orderId;
    private String serialNo;
    private String contractNo;
    private String urls;
    private String supplier;
    private String customer;    
    private String modelName;        
    private Integer orderQuantity;
    private String contractBackSign;
    private double unitPrice;
    private double deposit;
    private double advancePayment;
    @DateTimeFormat(pattern = "MM-dd-yyyy")
    private LocalDate deliveryDate;
    @DateTimeFormat(pattern = "MM-dd-yyyy")
    private LocalDate actualDeliveryDate;
    @DateTimeFormat(pattern = "MM-dd-yyyy")
    private LocalDate dateOfOrder;     
    @DateTimeFormat(pattern = "MM-dd-yyyy")
    private LocalDate advancePaymentDate;
    @DateTimeFormat(pattern = "MM-dd-yyyy")
    private LocalDate tailPaymentDay;
    @DateTimeFormat(pattern = "MM-dd-yyyy")
    private LocalDate estimatedPaymentDate;
    private String paymentMethod;
    private String paymentDay;   
    private String contractStatus;
    private String exporter;
    private String invoicingRecord;
    private String paymentRecord;
    private String remarks;
    private double totalAmount;
}
