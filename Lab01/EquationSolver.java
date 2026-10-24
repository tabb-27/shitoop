import javax.swing.*;

public class EquationSolver {
    public static void main(String[] args) {
        String option = JOptionPane.showInputDialog("Choose type (1 : Linear Equation, 2 : Linear System, 3 : Quadratic Equation) :");
        int choice = Integer.parseInt(option);

        switch (choice){
            case 1:
                solveLinearEquation();
                break;
            case 2:
                solveLinearSystem();
                break;
            case 3:
                solveQuadraticEquation();
                break;
            default:
                System.out.println("Invalid choice");
        }

        
    }

    private static void solveLinearEquation(){
        String strA = JOptionPane.showInputDialog("Enter a:");
        String strB = JOptionPane.showInputDialog("Enter b:");

        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);

        if (a != 0) {
            double solution = -b / a;
            System.out.println("The solution is " + solution);
        } else {
            if(b == 0){
                System.out.println("Infinite solutions");
            } else {
                System.out.println("No solution");
            }
        }
    }

    private static void solveLinearSystem(){
        String strA11 = JOptionPane.showInputDialog("Enter a11:");
        String strA12 = JOptionPane.showInputDialog("Enter a12:");
        String strA21 = JOptionPane.showInputDialog("Enter a21:");
        String strA22 = JOptionPane.showInputDialog("Enter a22:");
        String strB1 = JOptionPane.showInputDialog("Enter b1:");
        String strB2 = JOptionPane.showInputDialog("Enter b2:");

        double a11 = Double.parseDouble(strA11);
        double a12 = Double.parseDouble(strA12);
        double a21 = Double.parseDouble(strA21);
        double a22 = Double.parseDouble(strA22);
        double b1 = Double.parseDouble(strB1);
        double b2 = Double.parseDouble(strB2);

        double determinant = a11 * a22 - a12 * a21;

        if (determinant != 0) {
            double x = (b1 * a22 - a12 * b2) / determinant;
            double y = (a11 * b2 - b1 * a21) / determinant;
            System.out.println("The solution is x = " + x + ", y = " + y);
        } else {
            System.out.println("The system has no unique solution.");
        }

    }

    private static void solveQuadraticEquation(){
        String strA = JOptionPane.showInputDialog("Enter a:");
        String strB = JOptionPane.showInputDialog("Enter b:");
        String strC = JOptionPane.showInputDialog("Enter c:");

        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);
        double c = Double.parseDouble(strC);

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Solutions:  " + x1 + " and " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Solution: " + x);
        } else {
            System.out.println("No solution in real numbers");
        }
    }
}