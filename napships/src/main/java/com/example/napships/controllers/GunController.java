package com.example.napships.controllers;

import com.example.napships.models.Gun;
import com.example.napships.services.GunService;
import com.example.napships.services.NationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/guns")
public class GunController {
	@Autowired
	private GunService gunService;
	@Autowired
	private NationService nationService;

	@GetMapping("")
	public String getGunList(Model model){
		model.addAttribute("gunList", gunService.getAllGuns());
		return "guns/gun-list";
	}

	@GetMapping("/new")
	public String getNewGunForm(Model model){
		model.addAttribute("newGun", new Gun());
		model.addAttribute("nations", nationService.getAllNations());
		return "guns/add-gun";
	}

	@PostMapping("/new")
	public RedirectView postNewGun(@ModelAttribute Gun gun, Model model){
		gunService.addGun(gun);
		return new RedirectView("/guns");
	}
}
