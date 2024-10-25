package com.jsp.SportSpace.entity;

import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class TimeSlot {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int timeSlotId;
	
	private boolean isBooked;
	
	private LocalTime startTime;
	private LocalTime endTime;
	
	@ManyToOne
	private Turf turf;
}














