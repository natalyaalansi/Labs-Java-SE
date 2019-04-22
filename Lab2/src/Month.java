import java.util.Scanner;
public class Month {
    public static void main(String[] args) {
        Scanner N = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int month = N.nextInt();
        String whichMonth;
        switch (month) {
            case 1:
                whichMonth = "Январь";
                break;
            case 2:
                whichMonth = "Февраль";
                break;
            case 3:
                whichMonth = "Март";
                break;
            case 4:
                whichMonth = "Апрель";
                break;
            case 5:
                whichMonth = "Март";
                break;
            case 6:
                whichMonth = "Июнь";
                break;
            case 7:
                whichMonth = "Июль";
                break;
            case 8:
                whichMonth = "Август";
                break;
            case 9:
                whichMonth = "Сентябрь";
                break;
            case 10:
                whichMonth = "Октябрь";
                break;
            case 11:
                whichMonth = "Ноябрь";
                break;
            case 12:
                whichMonth = "Декабрь";
                break;
            default:
                whichMonth = "Не существует";
        }
        System.out.println(whichMonth);
    }

}
