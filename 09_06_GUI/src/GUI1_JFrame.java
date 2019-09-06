import javax.swing.*;

public class GUI1_JFrame {
    public static void main(String[] args) {
        JFrame frame=new JFrame("창이름");

        JLabel label = new JLabel("금요일이네.");
        frame.add(label);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
