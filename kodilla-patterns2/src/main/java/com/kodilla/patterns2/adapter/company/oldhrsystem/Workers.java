package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String [][] workers = {
            {"6502120085", "John", "Smith"},
            {"7802120085", "Jacob", "Smithson"},
            {"8002120085", "Jossie", "McSmith"},
            {"5002120085", "Jane", "Smithski"},
            {"4502120085", "Jinny", "Von Smithski"},
    };

    private double [] salaries = {
            4500.00,
            3700.00,
            4350.00,
            9000.00,
            6200.00
    };

    public String getWorker(int n) {
        if(n > salaries.length) {
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][3] + ", " + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
