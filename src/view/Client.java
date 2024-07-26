package view;

import controller.EmployeeManager;

public class Client {
    static EmployeeManager employeeManager = new EmployeeManager();

    public static void main(String[] args) {
//        1
        showSalaryAvg();
//        2
        System.out.println("Danh sachs");
    }

    private static void showSalaryAvg() {
        System.out.println("Muc luong trung binh la ");
        double s = EmployeeManager.calculateAVGSalary();
        System.out.println(s);
    }
}
