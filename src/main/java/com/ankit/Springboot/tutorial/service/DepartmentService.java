package com.ankit.Springboot.tutorial.service;

import com.ankit.Springboot.tutorial.entity.Department;
import com.ankit.Springboot.tutorial.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {

   public Department saveDepartment(Department department);

   public List<Department> fetchDepartmentList();

   public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

   public void deleteDepartmentById(Long departmentID);

   public Department updateDepartment(Long departmentId, Department department);

   public Department fetchDepartmentByName(String departmentName);
}
