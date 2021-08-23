package HR;

import java.util.Scanner;

public class Hiring {

    String comName;
    String empPosition;
    int expYears;
    double budgetedSalary;
    
    
    

    Scanner scan = new Scanner(System.in);

    public void setComName() {

        System.out.println("Please enter your Company Name :");
        comName = scan.nextLine();
    }

    public void setEmpPosition() {

        System.out.println("Please enter Empolyee Position :");
        empPosition = scan.nextLine();
    }

    public void setHiringService() {

        setComName();
        setEmpPosition();

        System.out.println("Please enter Experience : ");
        expYears = scan.nextInt();

        System.out.println("Please enter Budgeted Salary :");
        budgetedSalary = scan.nextInt();

    }

    public String getComName() {
        return comName;
    }

    public String getEmpPosition() {
        return empPosition;
    }

    public void getHiringService() {

        getComName();
        getEmpPosition();
        System.out.println("position's Experience is :" + expYears);
        System.out.println("the Budgeted Salary is :" + budgetedSalary);
        System.out.println("Thank you for using our service, we will get back to you ASAP...");

    }

}
