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
public class TurfOwner {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int turfOwnerId;
	
	@Column(nullable = false)
	private String ownerName;
	
	@Column(unique = true, nullable = false)
	private int mobile;
	
	@Column(unique = true, nullable = false)
	private String email;
	
	@Column(unique = true, nullable = false)
	private String password;
	
	@Autowired
	@OneToMany(mappedBy = "turfowner")
	private List<Turf> turfs;
}











