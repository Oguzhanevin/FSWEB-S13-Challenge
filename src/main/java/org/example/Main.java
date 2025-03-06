package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        // Healthplan, Employee, and Company nesnelerini oluştur
        createEntitiesAndPerformOperations();
    }

    public static void createEntitiesAndPerformOperations() {
        // Healthplan nesnesi oluştur
        Healthplan healthplan = new Healthplan(1, "A Sigorta", Plan.BASIC);

        // Employee için healthplans array oluştur
        String[] healthplans = new String[2];
        healthplans[0] = healthplan.getName();

        // Employee nesnesi oluştur
        Employee employee = new Employee(1, "John Doe", "jd@test.com", "1234", healthplans);

        // Company için employees array oluştur
        String[] employees = new String[2];
        employees[0] = employee.getFullName();

        // Company nesnesi oluştur
        Company company = new Company(1, "Workintech", 1000, employees);

        // Tüm nesnelerin toString() metodunu çağırarak ekrana yazdır
        System.out.println(healthplan);
        System.out.println(employee);
        System.out.println(company);

        // addHealthPlan metodunu test et
        employee.addHealthPlan(1, "Test Sigorta");
        System.out.println("Updated Employee with Health Plan: " + employee);

        // addEmployee metodunu test et
        company.addEmployee(1, "Jane");
        System.out.println("Updated Company with Developer: " + company);
    }
}
