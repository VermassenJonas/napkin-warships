package com.example.napships.models;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Ship {
	@Id
	@GeneratedValue
	private long id;
	private String shipClass;
	private String name;
	@ManyToOne
	@JoinColumn(name = "ship_type_id")
	private ShipType shipType;
	private LocalDate laidDownDate;

	@ManyToOne
	@JoinColumn(name = "nation_id")
	private Nation nation;

	@ManyToMany
	@JoinTable(
			name = "ship_gun",
			joinColumns = @JoinColumn(name = "ship_id"),
			inverseJoinColumns = @JoinColumn(name = "gun_id"))
	private List<Gun> guns;

}
