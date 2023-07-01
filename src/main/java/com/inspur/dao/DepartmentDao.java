package com.inspur.dao;

import com.inspur.pojo.Department;

import java.util.List;


public interface DepartmentDao {
    public List<Department> selectAll(String department_name);

    public void insert(Department department);

    public void update(Department department);

    public List<Department> findById(Integer departmentId);

    public void deleteById(Integer departmentId);
}
