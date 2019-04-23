package Decoratorhome;

public class OperaSinger extends DecoratorSinger {
    public OperaSinger (ASinger aSinger){
        super(aSinger);
    }

    @Override
    public String sing (String s){
        return super.sing(s).replaceAll("you can drive", "youuuuuuu caaaaaan driiiiiiive");
    }

}
