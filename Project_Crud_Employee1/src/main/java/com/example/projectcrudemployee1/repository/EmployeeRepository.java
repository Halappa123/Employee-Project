package com.example.projectcrudemployee1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projectcrudemployee1.dto.EmployeeDto;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeDto, String> {
	
}
