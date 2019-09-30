package application;

import presentation.InputForm;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        InputForm form = new InputForm();
        JFrame frame = new JFrame("InputFrame");
        frame.setContentPane(new InputForm().getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



    }

}
