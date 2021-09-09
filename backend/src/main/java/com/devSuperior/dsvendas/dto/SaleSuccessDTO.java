package com.devSuperior.dsvendas.dto;

import java.io.Serializable;

import com.devSuperior.dsvendas.entities.Seller;

public class SaleSuccessDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String sellerName;
	private Long viseted;
	private Long deals;

	public SaleSuccessDTO() {
	}

	public SaleSuccessDTO(Seller seller, Long viseted, Long deals) {
		sellerName = seller.getName();
		this.viseted = viseted;
		this.deals = deals;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Long getViseted() {
		return viseted;
	}

	public void setViseted(Long viseted) {
		this.viseted = viseted;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}

}
