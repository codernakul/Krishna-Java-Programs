import javax.swing.JOptionPane;
public class gui
{
    public static void main(String []args)
    {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog( null, "Hello my friend "+name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your Age"));
        JOptionPane.showMessageDialog(null , "So you are "+age+" years old");
        String game = JOptionPane.showInputDialog("Would you like to play a game? (Yes/No)");
        JOptionPane.showMessageDialog( null, "There is no game! O-O \n Thanks for running the program :)");
        
    }
}
        