package com.inspur.service;

import com.inspur.pojo.Department;

import java.util.List;


public interface DepartmentService {
    public List<Department> selectAll(String department_name);
    public void addDept(Department department);
    public Department findById(Integer departmentId);
    public void insert(Department dept);
    public void update(Department dept);
    public void delDepts(List<Integer> ids);
}
