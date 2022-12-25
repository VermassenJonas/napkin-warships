package com.example.napships.services;

import com.example.napships.models.ShipType;
import com.example.napships.persistence.ShipTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShipTypeServiceImpl implements ShipTypeService {

	@Autowired
	private ShipTypeRepository shipTypeRepository;

	@Override
	public Iterable<ShipType> getAllShipTypes() {
		return shipTypeRepository.findAll();
	}
}
