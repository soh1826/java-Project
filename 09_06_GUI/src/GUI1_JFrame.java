import javax.swing.*;

public class GUI1_JFrame {
    public static void main(String[] args) {
        JFrame frame=new JFrame("창이름");
        JPanel panel=new JPanel();
        JButton button=new JButton("오.");
        JLabel label = new JLabel("금요일이네.");

        panel.add(label);
        panel.add(button);
        frame.add(panel);


        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
