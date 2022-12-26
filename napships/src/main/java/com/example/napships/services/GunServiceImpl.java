package com.example.napships.services;

import com.example.napships.models.Gun;
import com.example.napships.persistence.GunRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GunServiceImpl implements GunService {

	@Autowired
	private GunRepository gunRepository;
	@Override
	public Iterable<Gun> getAllGuns() {
		return gunRepository.findAll();
	}

	@Override
	public void addGun(Gun gun) {
		gunRepository.save(gun);
	}
}
