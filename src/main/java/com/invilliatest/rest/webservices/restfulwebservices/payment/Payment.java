package com.invilliatest.rest.webservices.restfulwebservices.payment;

import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFilter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="Descrição sobre validação de paramentros")
@JsonFilter("PaymentFilter")
public class Payment {
	
	private Integer id;
	
	private String status;
	
	@Size(min=14, max=17, message="A quantidade de digitos de um cartão de crédito deve ser entre 14 e 17")
	@ApiModelProperty(notes="A quantidade de digitos de um cartão de crédito deve ser entre 14 e 17")
	private String creditcardNumber;
	
	@Future
	@ApiModelProperty(notes="Plagamento deve ser efetuado no futuro")
	private Date paymentDate;
	
	protected Payment() {
		
	}
	
	public Payment(Integer id, String status, String creditcardNumber, Date paymentDate) {
		super();
		this.id = id;
		this.status = status;
		this.creditcardNumber = creditcardNumber;
		this.paymentDate = paymentDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreditcardNumber() {
		return creditcardNumber;
	}

	public void setCreditcardNumber(String creditcardNumber) {
		this.creditcardNumber = creditcardNumber;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	@Override
	public String toString() {
		return "Payment [id=" + id + ", status=" + status + ", creditcardNumber=" + creditcardNumber + ", paymentDate="
				+ paymentDate + "]";
	}
	
	
}
