package Home_Work_1;
// Решето Эратосфена
public class JHW_2 {
    public static void sieveOfEratosthenes(int n)
    {
        int[] a = new int[n + 1];

        for (int i = 0; i <= n; i++) {      // обозначаем все числа как простые
            a[i] = 1;
        }

        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (a[i] == 1)                  // проверяем, является ли `i` простым числом
            {
                for (int j = 2; i * j <= n; j++) {
                    a[i * j] = 0;           // числа, кратные `i`, не являются простыми
                }
            }
        }

        for (int i = 2; i <= n; i++)
        {
            if (a[i] == 1) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args)
    {
        sieveOfEratosthenes(1000);
    }
}
