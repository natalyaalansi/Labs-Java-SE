package Factoryhome;
//Фабричный метод задаёт метод, который следует использовать
// вместо вызова оператора new для создания объектов-продуктов.
// Подклассы могут переопределить этот метод, чтобы изменять тип создаваемых продуктов.

public class Main {
    public static void main(String[] args) {
        PerfumeFactory factory = new PerfumeFactory();
        System.out.println(factory.producePerfume(50, "Patchouli"));
        System.out.println(factory.producePerfume(30, "Lavender"));
        System.out.println(factory.producePerfume(10, "Sandal"));
    }
}
