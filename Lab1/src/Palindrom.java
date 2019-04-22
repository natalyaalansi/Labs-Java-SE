import java.util.InputMismatchException;
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner N = new Scanner(System.in);
        System.out.println("Введите целое положительное пятизначное число");
        try {
            int pal = N.nextInt();
            if (pal < 0 || pal<9999 || pal>100000) {
                System.out.println("Введите положительное пятизначное число");
            } else {
                int next = 0;
                int pal2 = pal;

                while (pal2 != 0) {
                    next = (next * 10) + (pal2 % 10);
                    pal2 /= 10;
                }

                if (pal == next) {
                    System.out.println("Это число - " + pal + " - палиндром.");

                } else {
                    System.out.println("Это число - " + pal + " - не палиндром.");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Введите целое число");
        }
    }
}
