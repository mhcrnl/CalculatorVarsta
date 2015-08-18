import javax.swing.*;
import java.awt.*;

/**
 * Created by mhcrnl on 18.08.2015.
 */
public class CalculatorVarstaV1 extends JFrame {

    public CalculatorVarstaV1(){
        initUI();
    }

    private void initUI() {
        setTitle("Calculator Varsta");
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                CalculatorVarstaV1 cv = new CalculatorVarstaV1();
                cv.setVisible(true);
            }
        });
    }
}
