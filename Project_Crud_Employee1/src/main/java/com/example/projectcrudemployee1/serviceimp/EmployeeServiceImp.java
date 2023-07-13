package com.example.projectcrudemployee1.serviceimp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projectcrudemployee1.dto.EmployeeDto;
import com.example.projectcrudemployee1.repository.EmployeeRepository;
import com.example.projectcrudemployee1.service.EmployeeService;

@Service
public class EmployeeServiceImp implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
  
	//saveAllImp
	@Override
	public void saveAll(List<EmployeeDto> employeeDto) {
    employeeRepository.saveAll(employeeDto);
	}

	
	//get all details 
	@Override
	public Optional<EmployeeDto> getAllById(String id) {
		if(employeeRepository.existsById(id)) {
			
		return employeeRepository.findById(id);
		}
		return null;
		
	}


	@Override
	public String deleteEmployeeDto(String id) {
	if(employeeRepository.existsById(id)) {
		employeeRepository.deleteById(id);
		return "data Deleted By ID";
	}
	
		return "Both Id Doesnot exists";
	}


	@Override
	public String updateById(String id, EmployeeDto employeeDto) {
		if(employeeRepository.existsById(id)) {
			EmployeeDto exist=employeeRepository.findById(id).get();
			if(exist.getId()==null) {
			exist.setAge(employeeDto.getAge());
			exist.setEmpAddress(employeeDto.getEmpAddress());
			exist.setEmpEmail(employeeDto.getEmpEmail());
			exist.setEmpFirstName(employeeDto.getEmpFirstName());
			exist.setEmpLastName(employeeDto.getEmpLastName());
			employeeRepository.save(exist);
			return "All data Updated ";
		}
		else if(exist.getAge()==null ) {
			exist.setAge(employeeDto.getAge());
			employeeRepository.save(exist);
			return "Age updated ";
		}
		else if (exist.getEmpAddress()!=null && exist.getEmpEmail()!=null) {
			exist.setEmpAddress(employeeDto.getEmpAddress());
			exist.setEmpEmail(employeeDto.getEmpEmail());
			employeeRepository.save(exist);
		
			return "both Data updated ";
			
		}
		
		else if (exist.getEmpFirstName()==null) {
			exist.setEmpFirstName(employeeDto.getEmpFirstName());
			employeeRepository.save(exist);
			return "firstName UPDATED";
		}
		else if (exist.getEmpLastName()==null) {
			exist.setEmpLastName(employeeDto.getEmpLastName());
			employeeRepository.save(exist);
			return "lastName updated";
		}
			
	}
		return "Id Doesnot exists";
		
		
	}
}
