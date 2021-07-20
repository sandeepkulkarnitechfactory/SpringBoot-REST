package com.techfactory.SpringBootREST.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.techfactory.SpringBootREST.entity.Address;
import com.techfactory.SpringBootREST.entity.Employee;

@Component
public class EmployeeMockDataProvider {

	public List<Employee> getDummyEmployeeData() {
		List<Employee> result = new ArrayList<Employee>();
		
		for(int i=0;i<5;i++) {
			Employee emp = new Employee();
			emp.setId(Integer.valueOf(i).longValue());
			emp.setFirstName("First Name ->" + i);
			emp.setLastName("Last Name ->" + i);
			List<Address> addresses = new ArrayList<Address>();
			for(int j=0;j<2;j++) {
				Address add = new Address();
				add.setAddressLine1("AddressLine1 ->" + j);
				add.setAddressLine2("AddressLine2 ->" + j);
				add.setId(Integer.valueOf(j).longValue());
				addresses.add(add);
			}
			emp.setAddresses(addresses);
			result.add(emp);
		}
		return result;
	}
	
}
