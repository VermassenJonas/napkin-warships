package com.example.napships.controllers;

import com.example.napships.models.Gun;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {


	@GetMapping("/guns/{nationId}")
	public Iterable<Gun> getGunsForNation(@PathVariable long nationId ){
		return null;
	}
}
