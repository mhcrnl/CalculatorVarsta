/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorvarsta;

import java.awt.EventQueue;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author mhcrnl
 */
public class CalculatorVarsta extends JFrame{
    
    static JTextField nume;
    
    public CalculatorVarsta(){
        initUI();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EventQueue.invokeLater(new Runnable(){

            @Override
            public void run() {
                //throw new UnsupportedOperationException("Not supported yet.");
                //To change body of generated methods, choose Tools | Templates.
                CalculatorVarsta cv = new CalculatorVarsta();
                cv.setVisible(true);
            }
            
        });
    }

    private void initUI() {
        //throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 10));
        /**
         * GridLayout are doua coloane si cate siruri sunt necesare.
         */
        panel.setLayout(new GridLayout(0, 2, 15, 16));
        
        panel.add(new JLabel("Numele complet: "));
        nume = new JTextField();
        panel.add(nume);
        
        panel.add(new JLabel("Anul nasterii: "));
        JTextField an = new JTextField();
        panel.add(an);
        
        panel.add(new JLabel("Luna nasterii: "));
        JTextField luna = new JTextField();
        panel.add(luna);
        
        panel.add(new JLabel("Ziua nasterii(ex: 08): "));
        JTextField zi = new JTextField();
        panel.add(zi);
        
        panel.add(new JLabel("Dna/Dl varsta dvs. este: "));
        JLabel rezultat = new JLabel("Dl/Dna ");
        panel.add(rezultat);
        
        JButton calculeaza = new MyCalculeazaButton("Calculeaza");
        panel.add(calculeaza);
        
        MyExitButton close = new MyExitButton("Exit");
        panel.add(close);
        
        add(panel);
        setTitle("Calculator Varsta");
        setSize(350, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
}
