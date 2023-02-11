import java.awt.*;
import javax.swing.*;
public class p22 {
    JFrame f;
    public p22()
    {
        f=new JFrame();
        JButton b1 = new JButton("Hello");
        JButton b2 = new JButton("world");
        JButton b3 = new JButton("Click");
        JButton b4 = new JButton("Here");
        

        f.add(b1,BorderLayout.NORTH);
        f.add(b2,BorderLayout.SOUTH);
        f.add(b3,BorderLayout.EAST);
        f.add(b4,BorderLayout.WEST);
        f.setSize(400, 200);  
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new p22();
    }
}
