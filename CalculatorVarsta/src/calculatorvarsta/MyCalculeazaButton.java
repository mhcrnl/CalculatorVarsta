/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorvarsta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author mhcrnl
 */
public class MyCalculeazaButton extends JButton implements ActionListener{
    
    public MyCalculeazaButton(String text){
        super.setText(text);
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        CalculatorVarsta calc = new CalculatorVarsta();
        String text = calc.nume.getText();//nume.getText();
        System.out.println("Salut" +calc.nume.getText());
        //System.exit(0);
        //throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
