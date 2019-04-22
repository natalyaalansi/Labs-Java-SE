public class Average {
    public static void main(String[] args) {
        float mass[] = new float [] {1.2f, 5.65f,8.27f};
        float sum=0;


        for (int i = 0; i<mass.length; i++) {
            sum = sum+mass[i];
        }
        System.out.println("Сумма всех элементов массива: " + sum);

        float av = sum/mass.length;

        System.out.println("Среднее значение равно: " + av);
    }
}
