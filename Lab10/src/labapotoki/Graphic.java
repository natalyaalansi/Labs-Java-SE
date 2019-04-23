package labapotoki;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Graphic extends JFrame {
    private JProgressBar jProgressBar1 = new JProgressBar();
    private JProgressBar jProgressBar2 = new JProgressBar();

    private static final int MY_MINIMUM = 0;
    private static final int MY_MAXIMUM = 100;
    private MyRunnable thread1 = new MyRunnable(jProgressBar1, "Первый");
    private MyRunnable thread2 = new MyRunnable(jProgressBar2, "Второй");


    Graphic() {

        GridBagLayout gridBagLayout = new GridBagLayout(); // создание объекта класса GridBagLayout при помощи конструктора
        this.setLayout(gridBagLayout); //выбираем обьект класса
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //закрытие окна

        GridBagConstraints constraints = new GridBagConstraints(); // создание объекта класса, поля которого будут определять параметры размещения отдельных компонент
        constraints.fill = GridBagConstraints.BOTH; // Компонент занимает все отведенное для него пространство
        constraints.gridwidth = GridBagConstraints.REMAINDER; //компонент должен занять все оставшееся место в текущей строке
        constraints.weightx = 0; //все компоненты выровнены по центру (горизонталь и вертикаль)
        constraints.anchor = GridBagConstraints.CENTER; //Центрирование
        constraints.gridheight = 1; //компонент полностью помещается в одну ячейку
        constraints.gridx = GridBagConstraints.RELATIVE;
        constraints.gridy = GridBagConstraints.RELATIVE;
        constraints.weightx = 1;
        constraints.weighty = 1;
        constraints.insets = new Insets(20, 20, 20, 20); //отступы


        gridBagLayout.setConstraints(jProgressBar1, constraints);
        setSettingJProgressBar(jProgressBar1);
        add(jProgressBar1);

        gridBagLayout.setConstraints(jProgressBar2, constraints);
        setSettingJProgressBar(jProgressBar2);
        add(jProgressBar2);




        JButton jButton = new JButton("Старт");
        gridBagLayout.setConstraints(jButton, constraints);
        add(jButton);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Thread t1 = new Thread(thread1);
                Thread t2 = new Thread(thread2);


                ArrayList<Thread> threadsList = new ArrayList<>();
                threadsList.add(t1);
                threadsList.add(t2);



                for (Thread t : threadsList)
                {
                    t.start();
                }


            }
        });

        setSize(600, 300);
        setVisible(true);
    }

    private JProgressBar setSettingJProgressBar(JProgressBar nameJProgressBar) {
        nameJProgressBar.setVisible(true);
        nameJProgressBar.setStringPainted(true);
        nameJProgressBar.setMaximum(MY_MAXIMUM);
        nameJProgressBar.setMinimum(MY_MINIMUM);
        return nameJProgressBar;
    }



}