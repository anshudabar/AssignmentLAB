package com.application.model.dao;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="prj")
public class Project {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private String projectName;

	private Date startDate;

	private String managerName;
	
	public Project() {}

	public Project(String projectName, Date startDate, String managerName) {
		super();
		this.projectName = projectName;
		this.startDate = startDate;
		this.managerName = managerName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	
	
	

}
