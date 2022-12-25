package com.example.napships.controllers;

import com.example.napships.services.ShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@Autowired
	private ShipService shipService;

	@GetMapping("")
	public String getHome(Model model) {
		model.addAttribute("shipList", shipService.getAllShips());
		return "home";
	}
}
