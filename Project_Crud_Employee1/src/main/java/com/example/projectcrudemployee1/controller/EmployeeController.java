package com.example.projectcrudemployee1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.projectcrudemployee1.dto.EmployeeDto;
import com.example.projectcrudemployee1.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/Save_all")
	public List<EmployeeDto> saveAllDetails(@RequestBody List<EmployeeDto> employeeDto)
	{
		 employeeService.saveAll(employeeDto);
		return null;
	}
	
	@GetMapping("/get{id}")
	public Optional<EmployeeDto> getAllaById(@RequestParam String id) {
	
		return employeeService.getAllById(id);
	}
	
	@DeleteMapping("/delete{id}")
	public String deleteEmployeeDto(@RequestParam String id) {
		return employeeService.deleteEmployeeDto(id);
		
	}
	
	@PutMapping("/update{id}")
	public String updateEmplyeeDtoById(@PathVariable("id") String id,@RequestBody EmployeeDto employeeDto) {
		return employeeService.updateById(id,employeeDto);
	}
	
	
	
	
}
