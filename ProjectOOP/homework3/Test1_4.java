package homework3;

import homework3.bai1_4.Employee;

public class Test1_4 {
    public static void test() {
        Employee employee1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(employee1);

        employee1.setSalary(999);
        System.out.println(employee1);
        System.out.println("is is:" + employee1.getId());
        System.out.println("first name is:" + employee1.getFirstName());
        System.out.println("Last name is:" + employee1.getLastName());
        System.out.println("salary is:" + employee1.getSalary());

        System.out.println("name is:" + employee1.getName());
        System.out.println("annual salary is: " + employee1.getAnnualSalary());

        System.out.println(employee1.raiseSalary(10));
        System.out.println(employee1);
    }
}