public class SpaceDog extends AssistanceDog {
    @Override
    public void voice() {
        System.out.print("Собака-космонавт лает только если что-то не так. ");
    }

    @Override
    public void playWithBall() {
        System.out.print("Собака-космонавт иногда играет в мяч. ");
    }

    @Override
    public void train() {
        System.out.print("Серьезньее собак-космонавтов тренировки только у людей-космонавтов. ");

    }

    public void askWhy() {
        System.out.println("У собак-космонавтов насыщенная жизнь, но оно им вряд ли надо." );
    }
}
