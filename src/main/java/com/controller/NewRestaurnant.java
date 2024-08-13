package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.entity.RestaurantEntity;
import com.repository.RestaurnantRepository;


@Controller
public class NewRestaurnant {

	@Autowired
	RestaurnantRepository restaurnantRepository;
	
	@GetMapping("/newrestaurnant")
	public String newRestaurnant() {
		return "NewRestaurnant";
	}

	@PostMapping("/saverestaurant")
	public String saveRestaurant(RestaurantEntity restaurantEntity) {
		restaurnantRepository.save(restaurantEntity);
		return "Success";
	}
}

