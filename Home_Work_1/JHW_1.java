package Home_Work_1;

import java.io.IOException;
import java.util.Scanner;

public class JHW_1 {
    public static void main(String[] args) throws IOException {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Задайте число: ");
        Integer num = iScanner.nextInt();
        System.out.printf("Его триугольное число равно: %d\n", triangle(num));
        System.out.printf("Его факторал равен: %d", factor(num));
        iScanner.close();
    }
    static int triangle(int a) {
        int b = 0;
        for (int i = 0; i < a + 1; i++) {
            b = b + i;
        }
        return b;
    }
    static int factor(int a) {
        int b = 1;
        for (int i = 1; i < a + 1;  i++) {
            b = b * i;
        }
        return b;
    }
}