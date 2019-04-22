import java.util.InputMismatchException;
import java.util.Scanner;

public class Stroitel {
    public static void main(String[] args) {

        try {
            Scanner L = new Scanner(System.in);
            System.out.println("Введите длину отверстия");
            double l = L.nextDouble();

            Scanner H = new Scanner(System.in);
            System.out.println("Введите высоту отверстия");
            double h = H.nextDouble();

            Scanner Lbrick = new Scanner(System.in);
            System.out.println("Введите длину кирпича");
            double lBrick = Lbrick.nextDouble();

            Scanner HBrick = new Scanner(System.in);
            System.out.println("Введите высоту кирпича");
            double hBrick = HBrick.nextDouble();

            Scanner Wbrick = new Scanner(System.in);
            System.out.println("Введите ширину кирпича");
            double wBrick = H.nextDouble();

            if (lBrick < l && hBrick < h || hBrick<h && wBrick<l || lBrick<l && wBrick<h || hBrick<l && wBrick<h || hBrick<l && lBrick<h || wBrick<l &&lBrick<h) {
                System.out.println("Кирпич влазит.");
            } else System.out.println("Что-то пошло не так.");

        } catch (InputMismatchException e) {
            System.out.println("Введите положительное число");
        }
    }
}
