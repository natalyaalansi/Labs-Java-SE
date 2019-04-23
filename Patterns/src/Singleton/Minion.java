package Singletonhome; //Гарантирует существование только одного обьекта определенного класса,
// а также позволяет достучаться до этого обьекта из любого места программы

public class Minion {
    private Minion (){ //прячем конструктор
    }

    private static Minion innerMinion =
            new Minion(); //внутри заводим статическую переменную, проинициализированную самим собой (классом)
    public static Minion getMinion(){ //выдать наружу API в виде метода возвращающего это внутреннее состояние
        return innerMinion;
    }

    private int amountTwist;
    public void twistBooty(){
        amountTwist++;
        System.out.println("Olala");
    }


    public int getTwist() {
        return amountTwist;
    }


}
