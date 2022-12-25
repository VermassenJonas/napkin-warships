package com.example.napships.persistence;

import com.example.napships.models.ShipType;
import org.springframework.data.repository.CrudRepository;

public interface ShipTypeRepository extends CrudRepository<ShipType, Long> {
}
