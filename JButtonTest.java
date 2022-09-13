 
 
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class JButtonTest {
 
    JFrame frame;
    JPanel firstPanel, secondPanel;
 
    public JButtonTest() {
        frame = new JFrame();
        frame.setTitle("My JFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        firstPanel = new JPanel();
        firstPanel.setPreferredSize(new Dimension(250, 400));
        firstPanel.setBackground(Color.PINK);
 
        secondPanel = new JPanel();
        secondPanel.setPreferredSize(new Dimension(250, 400));
        secondPanel.setBackground(Color.BLACK);
 
        frame.setLayout(new FlowLayout());
        frame.add(firstPanel);
        frame.add(secondPanel);
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String args[]) {
        JButtonTest test = new JButtonTest();
    }
}