// После каждого числа, знака +-*/ или команды нажимайте Enter;
// c - откат назад (от слова "cancel");
// q - выход.
import java.util.Scanner;
import java.util.Stack;

public class Calculator {
    private static boolean isNumeric(String s) throws NumberFormatException {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    private static double calculate(double operand1, double operand2, String operation){
        switch (operation){
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2;
        }
        return 0.;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Double> stack = new Stack<>();
        stack.push(0.);
        String operation = "", input1, input2;
        double operand1, operand2, result;
        input1 = scanner.nextLine();
        while (!input1.equals("q")){
            if(!isNumeric(input1)){
                if(input1.equals("c")){
                    if(!stack.empty()){
                        stack.pop();
                    }
                    if(!stack.empty()){
                        System.out.println(stack.peek());
                    }
                } else { // input1 равняется арифметической операции
                    do{
                        input2 = scanner.nextLine();
                    } while(!isNumeric(input2));
                    if(!stack.empty()){
                        operand1 = stack.lastElement(); //возвращается элемент стека без удаления
                    } else {
                        operand1 = 0.;
                    }
                    operand2 = Double.parseDouble(input2);
                    result = calculate(operand1, operand2, input1);
                    stack.push(result);
                    System.out.println(result);
                }
            } else {
                stack.push(Double.parseDouble(input1));
            }
            input1 = scanner.nextLine();
        };
        scanner.close();
    }
}