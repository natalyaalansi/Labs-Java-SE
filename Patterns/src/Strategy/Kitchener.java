package Strategyhome;

public class Kitchener {
    private Recipe currentRecipe = null;
    public void cookDeliciousCake() {
        currentRecipe.cook();
    }
    public void changeRecipe (Recipe r) {
        this.currentRecipe = r;
    }
}
