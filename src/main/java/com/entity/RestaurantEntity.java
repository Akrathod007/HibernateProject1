package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "restaurnants")
public class RestaurantEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer restaurantId;
	@NotBlank(message = "Please Enter Restuarant Name")
	String name;
	@NotBlank(message = "Please Enter Restuarant Address")
	String Address;
	@NotBlank(message = "Please Enter Restuarant Category")
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
