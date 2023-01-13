package Home_Work_2;

import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;

public class JHW2_4 {
    public static void main(String[] args) throws SecurityException, IOException {
    Logger logger = Logger.getLogger(JHW2_2.class.getName());
    logger.setLevel(Level.INFO);
    FileHandler fh = new FileHandler("log_hw.log");
    fh.setFormatter(new SimpleFormatter());
    Scanner iScanner = new Scanner(System.in);
    System.out.print("Задайте число: ");
    Integer number1 = iScanner.nextInt();
    System.out.print("Математическая операция: ");
    char ch = iScanner.next().charAt(0);
    System.out.print("Задайте второе число: ");
    Integer number2 = iScanner.nextInt();
    logger.addHandler(fh);


    switch (ch) {
        case '+':
            int sum = number1 + number2;
            System.out.printf("Сумма: %d", sum);
            logger.log(Level.INFO, "Сумма");
            break;
        case '-':
            int sub = number1 - number2;
            System.out.printf("Разность: %d", sub);
            logger.log(Level.INFO, "Разность");
            break;
        case '/':
            double num1 = number1;
            double num2 = number2;
            double div = num1/num2;
            System.out.printf("Деление: %f", div);
            logger.log(Level.INFO, "Деление");
            break;
        case '*':
            int mult = number1 * number2;
            System.out.printf("Произведение: %d", mult);
            logger.log(Level.INFO, "Умножение");
            break;
    }
    iScanner.close();
  }
}
