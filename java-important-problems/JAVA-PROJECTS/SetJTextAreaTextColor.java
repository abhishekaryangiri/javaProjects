import javax.swing.JTextArea;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.FlowLayout;

public class SetJTextAreaTextColor
{
    public static void main()
    {	
        
        JTextArea textArea=new JTextArea();
        JFrame frame=new JFrame("Type anything here!");
        Color color=new Color(255,0,0);
        textArea.setForeground(color);
        frame.add(textArea);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,300);
        frame.setVisible(true);
    }
}