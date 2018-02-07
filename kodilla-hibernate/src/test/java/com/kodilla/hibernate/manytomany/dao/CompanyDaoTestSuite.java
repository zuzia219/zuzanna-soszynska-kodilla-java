package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarkson = new Employee("Stephanie", "Clarkson");
        Employee lindaKowalski = new Employee("Linda", "Kowalski");

        Company softwareMachines = new Company("Software Machines");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachines.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarkson);
        dataMaesters.getEmployees().add(lindaKowalski);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKowalski);

        johnSmith.getCompanies().add(softwareMachines);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarkson.getCompanies().add(dataMaesters);
        lindaKowalski.getCompanies().add(dataMaesters);
        lindaKowalski.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachines);
        int softwareMachinesId = softwareMachines.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int grayMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachinesId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, grayMatterId);

        //CleanUp
        try {

            companyDao.delete(softwareMachinesId);
            companyDao.delete(dataMaestersId);
            companyDao.delete(grayMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testQueriesFinndByString() {

        //Given
        Employee johnSmith = new Employee("John", "Smith");

        Company softwareMachines = new Company("Software Machines");

        softwareMachines.getEmployees().add(johnSmith);

        johnSmith.getCompanies().add(softwareMachines);

        //When
        employeeDao.save(johnSmith);
        int johnSmithId = johnSmith.getId();

        List<Employee> employeesWithLastName = employeeDao.retrieveEmployeesByLastname("Smith");

        //Then
        Assert.assertEquals(1, employeesWithLastName.size());

        //CleanUp
        employeeDao.delete(johnSmithId);

    }

    @Test
    public void testQueriesFindBySSubstring() {

        //Given
        Employee johnSmith = new Employee("John", "Smith");

        Company softwareMachines = new Company("Software Machines");

        softwareMachines.getEmployees().add(johnSmith);

        johnSmith.getCompanies().add(softwareMachines);

        //When
        companyDao.save(softwareMachines);
        int softwareMachinesId = softwareMachines.getId();

        List<Company> companiesWithThreeFirsLetters = companyDao.retrieveCompaniesByFirstThreeLetters("Sof");

        //Then
        Assert.assertEquals(1, companiesWithThreeFirsLetters.size());

        //CleanUp
        companyDao.delete(softwareMachinesId);

    }

}
