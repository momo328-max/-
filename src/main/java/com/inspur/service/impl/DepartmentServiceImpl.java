package com.inspur.service.impl;

import com.inspur.dao.DepartmentDao;
import com.inspur.pojo.Department;
import com.inspur.service.DepartmentService;
import com.mysql.cj.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentDao departmentDao;

    @Override
    public List<Department> selectAll(String department_name) {
        if(StringUtils.isNullOrEmpty(department_name)){
            department_name =null;
        }
        return departmentDao.selectAll(department_name);
    }

    @Override
    public void addDept(Department department) {
        departmentDao.insert(department);
    }

    @Override
    public Department findById(Integer departmentId) {
        List<Department> list = departmentDao.findById(departmentId);
        if(list.size()>0){
            return list.get(0);
        }
        return null;
    }

    @Override
    public void insert(Department dept){
        departmentDao.insert(dept);
    }

    @Override
    public void update(Department dept){
        departmentDao.update(dept);
    }
    @Override
    public void delDepts(List<Integer> ids){
        for (Integer id:ids
             ) {
            departmentDao.deleteById(id);
        }
    }
}
