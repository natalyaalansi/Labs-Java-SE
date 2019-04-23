package Strategyhome;
//Стратегия — это поведенческий паттерн, выносит набор алгоритмов в собственные классы и делает их взаимозаменимыми.
//Другие объекты содержат ссылку на объект-стратегию и делегируют ей работу.
// Программа может подменить этот объект другим, если требуется иной способ решения задачи.

public class CakeMaking {
    public static void main(String[] args) {
        Kitchener mama = new Kitchener();
        Recipe recipe = new DeliciousCake();

        mama.changeRecipe(recipe);
        mama.cookDeliciousCake();

        System.out.println("#####################################");

        Recipe recipe2 = new CookingAsTypicalMan();
        mama.changeRecipe(recipe2);
        mama.cookDeliciousCake();
    }
}
