package com.bridgelabz;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.EmployeePayrollData;
import com.bridgelabz.EmployeePayrollService;
import static com.bridgelabz.EmployeePayrollService.IOService.DATABASE_IO;

public class EmployeePayrollTest {
	@Test
	public void givenEmployeePayrollData_WhenRetrieved_ShouldMatchNumberOfEmployees() {
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		List<EmployeePayrollData> employeePayrollData = employeePayrollService.readEmployeePayrollData(DATABASE_IO);
		Assert.assertEquals(3, employeePayrollData.size());
	}
}
