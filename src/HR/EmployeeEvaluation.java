package HR;

import java.util.Scanner;

public class EmployeeEvaluation extends Hiring {

    String dep;
    int empId, evaluatingRate;
    Scanner input = new Scanner(System.in);

    public void setEvaluationService() {

        super.setComName();
        super.setEmpPosition();

        System.out.println("Please enter the Employee Department :");
        dep = input.nextLine();

        System.out.println("Please enter the Employee ID :");
        empId = input.nextInt();

        System.out.println("Please enter the Evaluationg Rate :");
        evaluatingRate = input.nextInt();

        if (evaluatingRate == 50) {
            System.out.println("you aren't doing good any more, you have one month as a deductions ya habebi");
        } else if (evaluatingRate >= 70 && evaluatingRate < 80) {
            System.out.println("helw yasta");
        } else if (evaluatingRate >= 80) {
            System.out.println("you are amazing, and you have 1 month bonus");
        }

    }

    public void getEvaluationService() {

        super.getComName();
        super.getEmpPosition();
        System.out.println("Please enter the Employee Department :" + dep);
        System.out.println("Please enter the Employee ID :" + empId);
        System.out.println("Please enter the Evaluationg Rate :" + evaluatingRate);

    }

}
