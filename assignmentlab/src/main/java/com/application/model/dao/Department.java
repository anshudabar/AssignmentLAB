package com.application.model.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="dept")
public class Department {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer did;

	private String dname;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
	private List<Employee> employees = new ArrayList<>();

	public Department() {}

	public Department(Integer did, String dname, List<Employee> employees) {
		this.did = did;
		this.dname = dname;
		this.employees = employees;
	}

	public int getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

}
