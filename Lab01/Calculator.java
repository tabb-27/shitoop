import javax.swing.*;
public class Calculator {
    public static void main(String[] args) {
        String num1 = JOptionPane.showInputDialog("Enter the first number:");
        String num2 = JOptionPane.showInputDialog("Enter the second number:");
        String operator = JOptionPane.showInputDialog("Enter the operator (1.+, 2.-, 3.*, 4./):");

        double n1 = Double.parseDouble(num1);
        double n2 = Double.parseDouble(num2);
        int op = Integer.parseInt(operator);

        double result = 0;
        switch (op){
            case 1:
                result = n1 + n2;
                break;
            case 2:
                result = n1 - n2;
                break;
            case 3:
                result = n1 * n2;
                break;
            case 4:
                if(n2 != 0){
                    result = n1 / n2;
                }
                else{
                    System.out.println("Error: Division by zero is not allowed");
                    return;
                }
        }
        System.out.println("Result: " + result);
    }
}