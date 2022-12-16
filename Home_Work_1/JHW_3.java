package Home_Work_1;

import java.io.IOException;
import java.util.Scanner;

public class JHW_3 {
  public static void main(String[] args) throws IOException {
    Scanner iScanner = new Scanner(System.in);
    System.out.print("Задайте число: ");
    Integer number1 = iScanner.nextInt();
    System.out.print("Математическая операция: ");
    char ch = iScanner.next().charAt(0);
    System.out.print("Задайте второе число: ");
    Integer number2 = iScanner.nextInt();

    switch (ch) {
        case '+':
            int sum = number1 + number2;
            System.out.printf("Сумма: %d", sum);
            break;
        case '-':
            int sub = number1 - number2;
            System.out.printf("Разность: %d", sub);
            break;
        case '/':
            double num1 = number1;
            double num2 = number2;
            double div = num1/num2;
            System.out.printf("Деление: %f", div);
            break;
        case '*':
            int mult = number1 * number2;
            System.out.printf("Произведение: %d", mult);
            break;
    }
    iScanner.close();
  }
}
