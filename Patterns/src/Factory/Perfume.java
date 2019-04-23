package Factoryhome;

public class Perfume {
    public int milliliters;

    public Perfume(int milliliters){
        this.milliliters = milliliters;
    }

    @Override
    public String toString(){
        return "Perfume{"+
                "class = " + this.getClass().getSimpleName()+", "+ "milliliters = "+milliliters+"}";

    }
}
