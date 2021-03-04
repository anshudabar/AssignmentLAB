package com.application.model.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="emp")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer eid;
	
	private String name;

	private double salary;

	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="did_fk")
	private Department department;

	private List<Project> Projects = new ArrayList<>();

	public Employee(Integer eid, String name, double salary, Department department, List<Project> projects) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.department = department;
		Projects = projects;
	}

	public Employee() {
		super();
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Project> getProjects() {
		return Projects;
	}

	public void setProjects(List<Project> projects) {
		Projects = projects;
	}
	
	

	
}
