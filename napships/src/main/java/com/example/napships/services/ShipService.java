package com.example.napships.services;

import com.example.napships.models.Ship;

public interface ShipService {
	Iterable<Ship> getAllShips();

	void addShip(Ship ship);
}
