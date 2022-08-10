package com.ntg.organization.organization.service;

import com.ntg.organization.organization.entity.Department;
import com.ntg.organization.organization.respository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService
{
    @Autowired
    DepartmentRepository departmentRepository;

    public Department createNewDepartment(Department newDep)
    {
        if(newDep != null)
        {
            return departmentRepository.save(newDep);
        }
        return null;
    }
}
