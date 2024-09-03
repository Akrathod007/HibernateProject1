package com.entity.OnetoOne;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pan")
public class PanEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer panId;
	String panNumber;
	String address;
	
	@OneToOne
	@JoinColumn(name = "citizenId")
	CitizenEntity citizenEntity;
	
	public Integer getPanId() {
		return panId;
	}
	public void setPanId(Integer panId) {
		this.panId = panId;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
