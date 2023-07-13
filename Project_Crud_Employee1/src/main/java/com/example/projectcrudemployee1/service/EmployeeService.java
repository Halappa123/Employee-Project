package com.example.projectcrudemployee1.service;

import java.util.List;
import java.util.Optional;

import com.example.projectcrudemployee1.dto.EmployeeDto;

public interface EmployeeService {

	void saveAll(List<EmployeeDto> employeeDto);

	Optional<EmployeeDto> getAllById(String id);

	String deleteEmployeeDto(String id);

	String updateById(String id, EmployeeDto employeeDto);

}
