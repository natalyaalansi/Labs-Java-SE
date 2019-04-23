package Decoratorhome;
//Для построения систем-“матрёшек”,
//где каждый класс можно завернуть в другой, тем самым расширив его функционал

public class Concert {
    public static void main(String[] args) {

        ASinger kirkorov = new SimpleSinger();
        System.out.println( kirkorov.sing("Baby you can drive my car!"));

        ASinger eminem  = new RapSinger (new SimpleSinger());
        System.out.println( eminem.sing("Baby you can drive my car!"));

        ASinger pavarotti  = new OperaSinger (new SimpleSinger());
        System.out.println( pavarotti.sing("Baby you can drive my car!"));

        ASinger solyanka  = new OperaSinger (new RapSinger ( new SimpleSinger()));
        System.out.println( solyanka.sing("Baby you can drive my car!"));

    }
}
