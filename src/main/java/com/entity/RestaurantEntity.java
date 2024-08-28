package com.entity;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "restaurnants")
public class RestaurantEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer restaurantId;
	@NotBlank(message = "Please Enter Restuarant Name")
	@Pattern(regexp = "[a-zA-Z\\s]+",message = "Please Enter Valid Restuarant Name")
	String name;
	@NotBlank(message = "Please Enter Restuarant Address")
	String Address;
	@NotBlank(message = "Please Enter Restuarant Category")
	@Length(min = 3,max = 20,message = "Please Enter Between 3 to 20 in size")
	String category;
	public Integer getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
