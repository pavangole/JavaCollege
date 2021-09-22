
import javax.swing.*;
import java.awt.*;


public class Practical_2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        String flags[] = { "English", "Marathi", "Hindi", " Sanskrit", "Urdu", "Arabic", "Ukranian", "Jpanese",
                "Chinese", "Malyanam", "Punjabi" };

        JLabel jb = new JLabel("Country");
        jb.setBounds(20, 20, 100, 20);

        JComboBox jc = new JComboBox<>(flags);
        jc.setBounds(20,60,100,30);
        frame.add(jb);
        frame.add(jc);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
	    frame.setSize(500,500);

    }
}
