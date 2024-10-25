package com.jsp.SportSpace.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Sport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sportId;
	
	@Column(nullable = false)
	private String name;
	
	@Autowired
	@OneToMany(mappedBy = "sport")
	private List<Turf> turfs;
	
}
