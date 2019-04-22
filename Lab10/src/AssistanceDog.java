public class AssistanceDog extends Doge implements Train {
    @Override
    public void voice() {
        System.out.print("Служебная собака говорит аф-аф только по команде. ");
    }

    @Override
    public void playWithBall() {
        System.out.print("Служебная собака тоже любит играть в мяч. ");
    }

    @Override
    public void train() {
        System.out.println("Служебная собака еще и постоянно тренируется. ");

    }
}
