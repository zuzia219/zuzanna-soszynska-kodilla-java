package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);

    public void processEmployeeSearch(EmployeeDao employeeDao, String employeeLastName) throws SearchException {
        if (employeeLastName.length() < 1) {
            LOGGER.error(SearchException.ERR_STRING_LENGTH_IS_ZERO);
            throw new SearchException(SearchException.ERR_STRING_LENGTH_IS_ZERO);
        }
        LOGGER.info("Beginning a search with phrase: -" + employeeLastName);
        List<Employee> employeesWithSpecificLastNme = employeeDao.retrieveEmployeesByLastname(employeeLastName);
        if (employeesWithSpecificLastNme.size() == 0) {
            LOGGER.info("There are no employees that match the search phrase: -" + employeeLastName);
        }
        for (Employee theEmployee : employeesWithSpecificLastNme) {
            LOGGER.info("Employee that matches the search phrase: " + theEmployee.getFirstname() + " " + theEmployee.getLastname());
        }
        LOGGER.info("Search with phrase: -" + employeeLastName + "- has ended");
    }

    public void processCompanySearch(CompanyDao companyDao, String firstThreeLetters) throws SearchException {
        if (firstThreeLetters.length() != 3) {
            LOGGER.error(SearchException.ERR_SUBSTRINGS_LENGTH_IS_NOT_THREE);
            throw new SearchException(SearchException.ERR_SUBSTRINGS_LENGTH_IS_NOT_THREE);
        }
        LOGGER.info("Beginning a search with phrase: -" + firstThreeLetters);
        List<Company> companiesWithThreeFirsLetters = companyDao.retrieveCompaniesByFirstThreeLetters(firstThreeLetters);
        if (companiesWithThreeFirsLetters.size() == 0) {
            LOGGER.info("There are no companies that match the search phrase: -" + firstThreeLetters);
        }
        for (Company theCompany : companiesWithThreeFirsLetters) {
            LOGGER.info("Company that matches the search phrase: " + theCompany.getName());
        }
        LOGGER.info("Search with phrase: -" + firstThreeLetters + "- has ended");
    }
}
