package com.lms.timesheet.data.webservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lms.timesheet.data.entity.Employee;
import com.lms.timesheet.data.repository.EmployeeRepoistory;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepoistory employeeRepoistory;

	@RequestMapping(value = "/employee" ,method = RequestMethod.GET)
	public List<Employee> getEmployees(@RequestParam(required = false) String id){
		List<Employee> employees = new ArrayList<>();
		if (null == id) {
			Iterable<Employee> emp=this.employeeRepoistory.findAll();
			emp.forEach(employee -> {employees.add(employee);});
		}else {
			Employee emp=this.employeeRepoistory.findByEmpId(Integer.parseInt(id));
			if(null!=emp){
				employees.add(emp);
			}
		}


		return employees;

	}
}
