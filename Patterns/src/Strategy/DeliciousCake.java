package Strategyhome;

public class DeliciousCake extends Recipe {
    @Override
    public void cook() {
        cookBiscuit();
        addCream();
        addLove();
    }

    private void cookBiscuit() {
        System.out.println("We bake a biscuit");
    }

    private void addCream() {
        System.out.println("We add a tasty cream");
    }

    private void addLove() {System.out.println("Doing everything with love!");}

}

