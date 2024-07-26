package controller;

import model.Employee;
import model.Fulltime;
import model.Parttime;
import storage.ReadWriteFile;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    public static List<Employee> employeeList;
    static {
        //add 5 emppp
        employeeList = ReadWriteFile.readFile("nv.txt");
    }

    public static void addNewEmployee(Employee employee) {
        employeeList.add(employee);
        ReadWriteFile.writeFile("nv.txt", employeeList);
    }

    public static double calculateAVGSalary() {
        double salary = 0;
        for (Employee employee : employeeList) {
            salary += employee.getSalary();
        }
        double averageSalary = salary / employeeList.size();
        return averageSalary;
    }

    public static List<Employee> getEFulltime() {
        double salary = calculateAVGSalary();
        List<Employee> employeeList1 = new ArrayList<>();
        for (Employee employee : employeeList) {
            if (employee.getSalary() <= salary) {
                employeeList1.add(employee);
            }
        }
        return employeeList1;

    }
}
