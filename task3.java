// 3) Реализовать простой калькулятор
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Введите первое число:");
       String num1 = scanner.nextLine();
       int number1 = Integer.parseInt(num1);
       System.out.println("Введите второе число:");
       String num2 = scanner.nextLine();
       int number2 = Integer.parseInt(num2);
       System.out.println("Введите арифметическую операцию('+' или '-' или '*' или '/')");
       char operation = scanner.next(".").charAt(0);
       
       if (operation == '+' ){
        int res = number1+number2;
        System.out.println(res);
       }else if (operation == '-' ){
        int res = number1-number2;
        System.out.println(res);
       }else if (operation == '*' ){
        int res = number1*number2;
        System.out.println(res);
       }else if (operation == '/' ){
        int res = number1/number2;
        System.out.println(res);
       }else {
        
        System.out.println("Некоректый ввод, введите '+' или '-' или '*' или '/' ");
       }
    }
    

}