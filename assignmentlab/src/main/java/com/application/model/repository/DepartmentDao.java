package com.application.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.model.dao.Department;

@Repository
public interface DepartmentDao extends JpaRepository<Department,Integer> {
	
}
