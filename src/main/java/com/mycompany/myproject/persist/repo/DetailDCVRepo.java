package com.mycompany.myproject.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.myproject.persist.entity.DetailDCV;

public interface DetailDCVRepo extends JpaRepository<DetailDCV, Long> {
	
}
