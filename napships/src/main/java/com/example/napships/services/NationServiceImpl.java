package com.example.napships.services;

import com.example.napships.models.Nation;
import com.example.napships.persistence.NationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NationServiceImpl implements NationService {

	@Autowired
	private NationRepository nationRepository;

	@Override
	public Iterable<Nation> getAllNations() {
		return nationRepository.findAll();
	}
}
