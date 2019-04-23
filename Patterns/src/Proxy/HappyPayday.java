package Proxyhome;
//Паттерн Proxy является суррогатом или замеcтителем другого объекта и контролирует доступ к нему.
//Предоставляя дополнительный уровень косвенности при доступе к объекту,
// может применяться для поддержки распределенного, управляемого или интеллектуального доступа.
//Являясь "оберткой" реального компонента, защищает его от излишней сложности.

public class HappyPayday {
    public static void main(String[] args) {
        Bank bank = new Atm();
        Slave first = new Slave("First");
        Slave second = new Slave("Second");
        Slave third = new Slave("Third");

        bank.pay(first);
        bank.pay(second);
        bank.pay(third);

        ((Atm) bank).payTrue();

    }
}
