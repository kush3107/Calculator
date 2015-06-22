package com.calc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Kushagra on 22-06-2015.
 */
public class Calculator extends JFrame implements ActionListener {
    float value1, value2, result;
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


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        e.getSource();
        if (e.getSource() != Addition || e.getSource() != Subtract || e.getSource() != Multiply || e.getSource() != Divide || e.getSource() != Result) {
            this.Output.setText(this.Output.getText() + ((JButton) e.getSource()).getText());
            value1 = Float.parseFloat(this.Output.getText());
        }
        else if (e.getSource()==Result){
            
        }
        else {
            this.Output.setText("");
            this.Output.setText(this.Output.getText() + ((JButton) e.getSource()).getText());
            value2 = Float.parseFloat(this.Output.getText());

        }
    }
}