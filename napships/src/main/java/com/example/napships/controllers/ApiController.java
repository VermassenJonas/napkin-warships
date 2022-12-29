package com.example.napships.controllers;

import com.example.napships.models.Gun;
import com.example.napships.services.GunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
	@Autowired
	private GunService gunService;


	@GetMapping("/guns/{nationId}")
	public Iterable<Gun> getGunsForNation(@PathVariable long nationId) {
		return gunService.getGunsByNation(nationId);
	}
}
