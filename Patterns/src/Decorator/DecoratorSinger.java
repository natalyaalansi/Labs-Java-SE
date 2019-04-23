package Decoratorhome;

public class DecoratorSinger extends SimpleSinger {
    protected ASinger decoratorSinger;

    public DecoratorSinger (ASinger decoratorSinger){
        this.decoratorSinger = decoratorSinger;
    }

    @Override
    public String sing (String s) {return decoratorSinger.sing(s);}
}
