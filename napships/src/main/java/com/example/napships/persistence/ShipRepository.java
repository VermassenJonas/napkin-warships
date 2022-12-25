package com.example.napships.persistence;

import com.example.napships.models.Ship;
import org.springframework.data.repository.CrudRepository;

public interface ShipRepository extends CrudRepository<Ship, Long> {
}
