package com.example.napships.persistence;

import com.example.napships.models.Nation;
import org.springframework.data.repository.CrudRepository;

public interface NationRepository extends CrudRepository<Nation, Long> {
}
