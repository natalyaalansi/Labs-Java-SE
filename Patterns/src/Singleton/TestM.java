package Singletonhome;

public class TestM {
    public static void main(String[] args) {
        Minion minion = Minion.getMinion();
        Minion bob = Minion.getMinion();
        minion.twistBooty();
        System.out.println(minion.getTwist());
        minion.twistBooty();
        minion.twistBooty();
        minion.twistBooty();
        System.out.println(minion.getTwist());
        bob.twistBooty();
        System.out.println(bob.getTwist());

    }
}

//class Kevin extends Minion{} невозможно отнаследоваться и сломать миньона