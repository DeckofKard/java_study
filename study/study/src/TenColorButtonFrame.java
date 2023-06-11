import java.awt.*;
import javax.swing.*;

public class TenColorButtonFrame extends JFrame{
    public TenColorButtonFrame(){
        setTitle("Ten Color Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout(FlowLayout.LEFT, 0,0));
        cp.setLayout(new GridLayout(1, 10));
        

        for(int i = 1; i <= 10; i ++){
            String num = Integer.toString(i);
            JButton btn = new JButton(num);
            btn.setBackground(new Color(20*i, 20*i, 20*i));
            cp.add(btn);
        }



        setSize(500, 100);
        setVisible(true);
    }
    public static void main(String[] args){
        new TenColorButtonFrame();
    }
}