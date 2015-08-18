import javax.swing.*;
import java.awt.*;
//import java.awt.event.ActionListener;

public class CalculatorVarsta extends JFrame {

    public CalculatorVarsta(){
        frameInitUI();
    }

    private void frameInitUI(){

        setTitle("Calculator Varsta");
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                CalculatorVarsta cv = new CalculatorVarsta();
                cv.setVisible(true);
            }
        });
    }
}