package com.kodilla.patterns2.adapter.company.newhrsystem;

import java.math.BigDecimal;
import java.util.List;

public class CompanySalaryProcessor implements SalaryProcessor {
    @Override
    public BigDecimal calculateSalaries(List<Employee> employees) {
        BigDecimal sum = BigDecimal.ZERO;
        for (Employee theEmployee: employees) {
            System.out.println(theEmployee);
            sum = sum.add(theEmployee.getBaseSalary());
        }
        return sum;
    }
}
