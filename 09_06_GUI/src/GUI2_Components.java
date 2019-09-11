import javax.swing.*;
import java.awt.*;

public class GUI2_Components {
    public static void main(String[] args) {
        JFrame frame=new JFrame("components");
        JPanel panel=new JPanel();
        JLabel lb0=new JLabel("JLabel");
        JButton bt0=new JButton("JButton");
        JCheckBox ch0=new JCheckBox("JCheckBox");
        JCheckBox ch1=new JCheckBox("JCheckBox");
        JRadioButton rb0=new JRadioButton("미성년자");
        JRadioButton rb1=new JRadioButton("성인");
        JTextField tf0=new JTextField("JTextField");
        JTextArea ta0=new JTextArea(2,10);
        String [] fruits= {"apple", "banana", "kiwi", "mango", "pear", "peach",
                "berry", "strawberry", "blackberry"};
        JComboBox combo = new JComboBox(fruits);

        panel.add(combo);
        panel.add(ch0);
        panel.add(ch1);
        panel.add(rb0);
        panel.add(rb1);
        panel.add(tf0);
        panel.add(ta0);
        panel.add(bt0);
        frame.add(panel);

        frame.pack();
        frame.setPreferredSize(new Dimension(600, 400));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
