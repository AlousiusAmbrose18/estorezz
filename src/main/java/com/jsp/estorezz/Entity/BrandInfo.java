package com.jsp.estorezz.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.jsp.estorezz.util.AppConstants;

@Entity
@Table(name=AppConstants.BRAND_INFO)
public class BrandInfo implements Serializable {
	
	@Id
	private Integer brandId;
	
	private String brandName;
	
	private String brandValue;
	
	private String ceoName;

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBrandValue() {
		return brandValue;
	}

	public void setBrandValue(String brandValue) {
		this.brandValue = brandValue;
	}

	public String getCeoName() {
		return ceoName;
	}

	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}

	@Override
	public String toString() {
		return "BrandInfo [brandId=" + brandId + ", brandName=" + brandName + ", brandValue=" + brandValue
				+ ", ceoName=" + ceoName + "]";
	}
	
	
	
	

}
