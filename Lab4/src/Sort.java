import java.util.Random;

public class Sort {
    public static void main(String[] args) {

        int mass [] = new int[10];
        for (int i = 0; i<mass.length; i++){
            mass[i] = (int) Math.round(Math.random() *150);
            System.out.print(mass[i] + " ");
        }

        System.out.println("\n");


        for (int i = 0; i< mass.length; i++){
            int min = mass[i];  //пусть первый элемент самый маленький
            int imin = i;       //индекс минимального элемента

            //т.к. первый элемент минимальный, просматриваем массив дальше

            for (int j=i+1; j<mass.length; j++){
                //если появился новый минимум, то запоминаем его индекс и обновляем значение
                if (mass[j] <min) {
                    min = mass[j];
                    imin = j;
                }
            }

            //Проверяем, если есть элемент меньше текущего, то меняем их местами

            if (i != imin){
                int temporary = mass[i];
                mass [i] = mass [imin];
                mass [imin] = temporary;
            }


            System.out.print(mass [i] + " ");
        }

        }
}
