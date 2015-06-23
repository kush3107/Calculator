package com.calc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Kushagra on 22-06-2015.
 */
public class Calculator extends JFrame implements ActionListener {
    float value1, value2, result, counter = 0;
    int check = 0;
    char ch, ch1;
    private JButton buttonOne;
    private JPanel panel1;
    private JButton buttonTwo;
    private JButton buttonThree;
    private JButton buttonSix;
    private JButton Addition;
    private JButton Subtract;
    private JButton buttonFive;
    private JButton buttonFour;
    private JButton Multiply;
    private JButton Result;
    private JButton buttonNine;
    private JButton Divide;
    private JButton buttonEight;
    private JButton buttonSeven;
    private JButton buttonZero;
    private JTextField Output;
    private JButton Clear;

    public Calculator() {
        super();
        setContentPane(panel1);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        this.buttonOne.addActionListener(this);
        this.buttonTwo.addActionListener(this);
        this.buttonThree.addActionListener(this);
        this.buttonFour.addActionListener(this);
        this.buttonFive.addActionListener(this);
        this.buttonSix.addActionListener(this);
        this.buttonSeven.addActionListener(this);
        this.buttonEight.addActionListener(this);
        this.buttonNine.addActionListener(this);
        this.buttonZero.addActionListener(this);
        this.Addition.addActionListener(this);
        this.Subtract.addActionListener(this);
        this.Divide.addActionListener(this);
        this.Multiply.addActionListener(this);
        this.Result.addActionListener(this);
        this.Clear.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Addition || e.getSource() == Subtract || e.getSource() == Multiply || e.getSource() == Divide) {
            value1 = Float.parseFloat(this.Output.getText());
            ch = (((JButton) e.getSource()).getText()).charAt(0);
            this.Output.setText("");

        } else if (e.getSource() == buttonOne || e.getSource() == buttonTwo || e.getSource() == buttonThree || e.getSource() == buttonFour || e.getSource() == buttonFive || e.getSource() == buttonSix || e.getSource() == buttonSeven || e.getSource() == buttonEight || e.getSource() == buttonNine || e.getSource() == buttonZero) {
            if (result != 0) {
                this.Output.setText("");
                result = 0;
            }
            this.Output.setText(this.Output.getText() + ((JButton) e.getSource()).getText());
        } else if (e.getSource() == Result) {
            value2 = Float.parseFloat(this.Output.getText());
            switch (ch) {
                case '+':
                    result = value1 + value2;
                    break;
                case '-':
                    result = value1 - value2;
                    break;
                case '*':
                    result = value1 * value2;
                    break;
                case '/':
                    result = value1 / value2;
                    break;
                default:
                    result = 0;
            }
            this.Output.setText(Float.toString(result));
        } else if (e.getSource() == Clear) {
            String current = this.Output.getText();
            current = current.replace(current.substring(current.length() - 1), "");
            this.Output.setText(current);
        }

    }

}