package labapotoki;

import javax.swing.*;
import java.util.Random;

public class MyRunnable implements Runnable //объявление класса реализующего интерфейс Runnable
{
    private JProgressBar nameJProgressBar;
    private int value;

    MyRunnable(JProgressBar nameJProgressBar, String name) {
        this.nameJProgressBar = nameJProgressBar;
        Thread t = new Thread();
        t.setName(name);

    }


    @Override
    public void run()

    {
        System.out.println("start " + Thread.currentThread().getName());
        Random random = new Random();
        {
            while (!(nameJProgressBar.getValue() == 100)) {
                value = random.nextInt(5);//рандомное заполнение шкалы, скорость
                nameJProgressBar.setValue(nameJProgressBar.getValue() + value);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.toString();
                }
            }
            Thread.interrupted();
            System.out.println("Thread kill" + Thread.currentThread().getName());
        }

    }
}
