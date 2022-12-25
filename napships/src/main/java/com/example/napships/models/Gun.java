package com.example.napships.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.Year;

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
	private String caliber;
	private String barrel;
	private Year developedYear;
}
