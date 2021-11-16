package lab1;

import java.util.Scanner;

public class PensionContributionCalculatorWithSentinel {
    public static void Pension() {
        Scanner in = new Scanner(System.in);
        final int SALARY_CEILING = 6000;
        final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
        final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
        final double EMPLOYEE_RATE_55_TO_60 = 0.13;
        final double EMPLOYER_RATE_55_TO_60 = 0.13;
        final double EMPLOYEE_RATE_60_TO_65 = 0.075;
        final double EMPLOYER_RATE_60_TO_65 = 0.09;
        final double EMPLOYEE_RATE_65_ABOVE = 0.05;
        final double EMPLOYER_RATE_65_ABOVE = 0.075;
        // Declare variables
        int salary, age; // to be input
        int contributableSalary;
        System.out.println("age =");
        age = in.nextInt();
        System.out.println("salary =");
        salary = in.nextInt();
        double employeeContribution, employerContribution, totalContribution;
        if (salary != -1) {
            contributableSalary = SALARY_CEILING - salary;

            if (age <= 55) { // 55 and below
                employeeContribution = contributableSalary * EMPLOYEE_RATE_55_AND_BELOW;
                employerContribution = contributableSalary * EMPLOYER_RATE_55_AND_BELOW;
                totalContribution = employeeContribution + employerContribution;
            } else if (age <= 60) { // (60, 65]
                employeeContribution = contributableSalary * EMPLOYEE_RATE_55_TO_60;
                employerContribution = contributableSalary * EMPLOYER_RATE_55_TO_60;
                totalContribution = employeeContribution + employerContribution;

            } else if (age <= 65) { // (55, 60]
                employeeContribution = contributableSalary * EMPLOYEE_RATE_60_TO_65;
                employerContribution = contributableSalary * EMPLOYER_RATE_60_TO_65;
                totalContribution = employeeContribution + employerContribution;

            } else { // above 65
                employeeContribution = contributableSalary * EMPLOYEE_RATE_65_ABOVE;
                employerContribution = contributableSalary * EMPLOYER_RATE_65_ABOVE;
                totalContribution = employeeContribution + employerContribution;
            }
            System.out.println("Enter the monthly salary (or -1 to end)::" + salary);
            System.out.println("Enter the age:" + age);
            System.out.printf("Thfe employee's contribution is: %.2f%n",employeeContribution);
            System.out.printf("The employer's contribution is: %.2f%n",employerContribution);
            System.out.printf("The total contribution is: %.2f%n",totalContribution);
        }else{
            System.out.println("bye!");
        }
    }
    public static void main(String[] args) {
        while (true){
            Pension();
        }

    }
}
