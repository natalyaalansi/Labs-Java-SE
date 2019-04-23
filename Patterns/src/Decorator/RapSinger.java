package Decoratorhome;

public class RapSinger extends DecoratorSinger {
    public RapSinger (ASinger decoratedSinger){
        super(decoratedSinger);
    }

    @Override
    public String sing (String s){
        return super.sing(s).replaceAll("Baby", "Bbaby bbbaby bbbaby");
    }
}
