package com.example.napships.services;

import com.example.napships.models.Gun;

public interface GunService {
	Iterable<Gun> getAllGuns();

	void addGun(Gun gun);

	Iterable<Gun> getGunsByNation(long id);
}
