package com.lms.timesheet.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lms.timesheet.data.entity.Employee;

@Repository
public interface EmployeeRepoistory extends CrudRepository<Employee,Long> {
	Employee findByEmpId(int number);
}
