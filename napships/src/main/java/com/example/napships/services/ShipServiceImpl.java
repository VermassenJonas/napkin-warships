package com.example.napships.services;

import com.example.napships.models.Ship;
import com.example.napships.persistence.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShipServiceImpl implements ShipService {

	@Autowired
	private ShipRepository shipRepository;

	@Override
	public Iterable<Ship> getAllShips() {
		return shipRepository.findAll();
	}

	@Override
	public void addShip(Ship ship) {
		shipRepository.save(ship);
	}
}
