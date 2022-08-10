package com.ntg.organization.organization.respository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ntg.organization.organization.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

	public Employee findByNameAndEmail(String name, String email);

	@Modifying
	@Query("update employee e set e.dept_id =:depID where e.id =:empID")
	public void setEmployeesDepartment(Long empID, Long depID);
}
