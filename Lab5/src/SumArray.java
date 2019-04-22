import java.util.InputMismatchException;
import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        try {
            Scanner N = new Scanner(System.in);
            System.out.println("Введите число строк");
            int n = N.nextInt();
            Scanner M = new Scanner(System.in);
            System.out.println("Введите число столбцов");
            int m = M.nextInt();
            if (m != n) {
                System.out.println("Матрица должна быть квадратной");
            }
            if ((m <= 0) || (n <= 0)) {
                System.out.println("Введите положительное значение");
            }

            else {
                int mass[][] = new int[n][m];

                for (int i = 0; i < mass.length; i++) {
                    for (int j = 0; j < mass[i].length; j++) {
                        mass[i][j] = (int) (Math.random() * 10);
                    }
                }

                for (int i = 0; i < mass.length; i++, System.out.println()) {
                    for (int j = 0; j < mass[i].length; j++) {
                        System.out.print(mass[i][j] + " ");
                    }
                }
                int sum = 0;

              /*  for (int i = 0; i < mass.length; i++) {
                    for (int j = 0; j < mass[i].length; j++) {
                        if (i == j) {
                            sum = sum + mass[i][j];
                        }
                    }
                }*/
                System.out.println("След матрицы: " + sum);
            }
        } catch (InputMismatchException e) {
            System.out.println("Введите целое число");

        }
    }
}


