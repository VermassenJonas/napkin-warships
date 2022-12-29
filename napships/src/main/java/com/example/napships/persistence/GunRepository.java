package com.example.napships.persistence;

import com.example.napships.models.Gun;
import org.springframework.data.repository.CrudRepository;

public interface GunRepository extends CrudRepository<Gun, Long> {
	Iterable<Gun> findByNation_Id(long id);
}
