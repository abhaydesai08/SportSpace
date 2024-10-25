package com.jsp.SportSpace.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.SportSpace.entity.Turf;

@Repository
public interface TurfRepository extends JpaRepository<Turf, Integer>{

}
