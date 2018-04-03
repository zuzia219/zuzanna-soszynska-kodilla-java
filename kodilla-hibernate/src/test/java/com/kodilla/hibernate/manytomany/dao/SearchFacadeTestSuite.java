package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.facade.SearchException;
import com.kodilla.hibernate.manytomany.facade.SearchFacade;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFacadeTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    SearchFacade searchFacade;

    @Test
    public void testSearchFacadeCompanyName() throws SearchException {

        //Given
        Employee johnSmith = new Employee("John", "Smith");

        Company softwareMachines = new Company("Software Machines");

        softwareMachines.getEmployees().add(johnSmith);

        johnSmith.getCompanies().add(softwareMachines);

        //When
        companyDao.save(softwareMachines);
        int softwareMachinesId = softwareMachines.getId();

        //Then
        searchFacade.processCompanySearch(companyDao, "sof");

        //CleanUp
        companyDao.delete(softwareMachinesId);
    }

    @Test
    public void testSearchFacadeEmployeeName() throws SearchException {

        //Given
        Employee johnSmith = new Employee("John", "Smith");

        Company softwareMachines = new Company("Software Machie");

        softwareMachines.getEmployees().add(johnSmith);

        johnSmith.getCompanies().add(softwareMachines);

        //When
        employeeDao.save(johnSmith);
        int johnSmithId = johnSmith.getId();

        //Then
        searchFacade.processEmployeeSearch(employeeDao, "Smith");

        //CleanUp
        employeeDao.delete(johnSmithId);
    }
}
