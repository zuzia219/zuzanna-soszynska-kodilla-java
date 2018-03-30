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
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);

    public void processEmployeeSearch (final Employee employee, String searchfrase ) {



    }

    public void processEmployeeSearch (final Company company, String firstThreeLetters ) throws SearchException {
        if (firstThreeLetters.length() != 3) {
            LOGGER.error(SearchException.ERR_SUBSTRINGS_LENGTH_IS_NOT_THREE);
            throw new SearchException(SearchException.ERR_SUBSTRINGS_LENGTH_IS_NOT_THREE);
        }
        companyDao.save(company);
        List<Company> companiesWithThreeFirsLetters = companyDao.retrieveCompaniesByFirstThreeLetters(firstThreeLetters);
        for (Company theCompany : companiesWithThreeFirsLetters){
            //LOGGER.info();
        }

    }
}
