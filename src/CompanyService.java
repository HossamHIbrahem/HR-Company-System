
import HR.*;
import javax.swing.JOptionPane;

public class CompanyService {

    public static void main(String[] args) {

        Hiring h1 = new Hiring();
        EmployeeEvaluation e1 = new EmployeeEvaluation();

        System.out.println("Welcome to El Samanody for HR Services");

        String service = JOptionPane.showInputDialog("Please enter your request"); 
        if (service.equals("Hiring")) {
            h1.setHiringService();
            h1.getHiringService();
            
        }else if (service.equals("Evaluation")) {
            e1.setEvaluationService();
            e1.getEvaluationService();
        }
        {
        
        }

//        switch (service) {
//            case "Hiring":
//                h1.setHiringService();
//                h1.getHiringService();
//                break;
//            case "Evaluation":
//                e1.setEvaluationService();
//                e1.getEvaluationService();
//                break;
//            default:
//                System.out.println("Sorry, We don't Have your request now.");
//                break;
//        }

    }
}
