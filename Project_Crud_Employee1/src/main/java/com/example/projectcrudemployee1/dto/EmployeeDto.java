package com.example.projectcrudemployee1.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


import lombok.Data;

@Data
@Entity
@Table(name="Crud_Employee1")
public class EmployeeDto {
	
	@Id
	@GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name="Emplyee_Id")
	private String id;
	@Column(name="Employee_First_Name")
	private String empFirstName;
	@Column(name="Employee_Last_Name")
	private String empLastName;
	@Column(name="Employee_Address")
	private String empAddress;
	@Column(name="Employee_Emial")
	private String empEmail;
	@Column(name="Employee_Age")
	private String age;

}
