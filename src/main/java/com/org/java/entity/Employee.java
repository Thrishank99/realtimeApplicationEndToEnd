package com.org.java.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
public class Employee {
	@Id
	@GeneratedValue
	private int empId;
	private String empName;
	private int age;
	private double salary;
	private String department;
	private String workLocation;
	private String disgination;
	

}
