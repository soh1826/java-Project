import javax.swing.*;
import java.awt.*;

public class sample {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        JPanel panel=new JPanel();

        frame.add(panel);

        frame.pack();
        frame.setPreferredSize(new Dimension(600, 400));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
