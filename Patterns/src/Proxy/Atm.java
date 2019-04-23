package Proxyhome;

import java.util.ArrayList;
import java.util.List;

public class Atm extends Bank {
    private List<Slave> slaves = new ArrayList<>();

    @Override
    public void pay(Slave sl){
        System.out.println("The money is over. Haha...");
        slaves.add(sl);
    }

    public void payTrue(){
        for(Slave s: slaves){
            super.pay(s);
        }
    }
}
