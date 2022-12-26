package com.example.napships.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.Year;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Gun {
	@Id
	@GeneratedValue
	private long id;

	@ManyToOne
	@JoinColumn(name = "nation_id")
	private Nation nation;
	private double caliber;
	private double barrel;
	private Year developedYear;

	@ManyToMany(mappedBy = "guns")
	private List<Ship> ships;
}
