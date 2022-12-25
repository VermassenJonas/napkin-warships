package com.example.napships.controllers;

import com.example.napships.models.Ship;
import com.example.napships.services.NationService;
import com.example.napships.services.ShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/ships")
public class ShipController {

	@Autowired
	private ShipService shipService;
	@Autowired
	private NationService nationService;

	@GetMapping
	public String getShipList(Model model) {
		model.addAttribute("shipList", shipService.getAllShips());
		return "ships/ship-list";
	}

	@GetMapping("/new")
	public String getShipForm(Model model) {
		model.addAttribute("newShip", new Ship());
		model.addAttribute("nations", nationService.getAllNations());
		return "ships/add-ship";
	}

	@PostMapping("/new")
	public RedirectView postNewShip(@ModelAttribute Ship ship, Model model) {
		shipService.addShip(ship);
		return new RedirectView("/ships");
	}
}
