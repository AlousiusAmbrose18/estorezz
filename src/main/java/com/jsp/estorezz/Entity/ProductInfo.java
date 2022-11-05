package com.jsp.estorezz.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.jsp.estorezz.util.AppConstants;


@Entity
@Table(name=AppConstants.PRODUCT_INFO)
public class ProductInfo implements Serializable {

	@Id
	private Long pid;
	
	public void setPid(Long pid) {
		this.pid = pid;
	}

	private String pName;
	
	private String price;
	
	private String rating;


	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "ProductInfo [pid=" + pid + ", pName=" + pName + ", price=" + price + ", rating=" + rating + "]";
	}
	
}
