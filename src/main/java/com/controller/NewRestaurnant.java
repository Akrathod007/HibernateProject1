package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String saveRestaurant(@Validated RestaurantEntity restaurantEntity,BindingResult result,Model model) {
		//validation
		if(result.hasErrors()) {
			//System.out.println(result.getAllErrors());
			model.addAttribute("result",result);
			return "NewRestaurnant";
		}
		else {
			restaurnantRepository.save(restaurantEntity);
			//System.out.println(restaurantEntity.getName());
			model.addAttribute("restaurantEntity",restaurantEntity);
			return "redirect:/restaurants";
		}
	}
	
	@GetMapping("/restaurants")
	public String listRestaurants(Model model) { 
		List<RestaurantEntity> restaurants = restaurnantRepository.findAll();
		model.addAttribute("restaurants", restaurants);
		return "ListRestaurants";
	}
	
	@GetMapping("/deleterestuarant")
	public String deleteRestaurant(@RequestParam("restaurantId") Integer restaurantId) {
		restaurnantRepository.deleteById(restaurantId);
		return "redirect:/restaurants";
	}
	
	@GetMapping("/editrestuarant")
	public String editRestuarant(@RequestParam("restaurantId") Integer restaurantId,Model model) {
		Optional<RestaurantEntity> restaurantEntities = restaurnantRepository.findById(restaurantId);
		if(restaurantEntities.isEmpty()) {
			return "Error";
		}
		else {
			model.addAttribute("restaurant",restaurantEntities.get());
			return "EditRestuarant";
		}
	}
	
	@PostMapping("/updaterestaurant")
	public String updateRestaurant(RestaurantEntity restaurantEntity) {
		restaurnantRepository.save(restaurantEntity);
		return "redirect:/restaurants";
	}
}

