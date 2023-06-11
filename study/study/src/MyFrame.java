import javax.swing.*;       // Swing component
import java.awt.*;          // graphic

public class MyFrame extends JFrame{
    MyFrame(){
        setTitle("first frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setBackground(Color.ORANGE);
        contentPane.setLayout(new FlowLayout());

        contentPane.add(new JButton("OK"));
        contentPane.add(new JButton("Cancel"));
        contentPane.add(new JButton("Ignore"));

        
        setSize(300,150);
        setVisible(true);
    }
    public static void main(String[] args){
        // MyFrame mf = new MyFrame();
    }
}
