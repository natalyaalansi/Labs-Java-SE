public class Doge extends Animals implements PlayWithBall {
    @Override
    public void voice() {
        System.out.print("Песя говорит: аф-аф. ");
    }

    @Override
    public void playWithBall() {
        System.out.println("Песя бегает за мячиком.");
    }
}

