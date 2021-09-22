
/**
 * Author :- Pavan Gole
 * IDCODE :- 19CM023
 * Date   :- 19 Sept 2021
 *
 */
/*Practical No :-1 */
/* Write a Program to demonstrate the use of JLabel and ImageIcon, JTextField
    and JPasswordField. 
*/

import javax.swing.*;
import java.awt.*;
import java.applet.*;

public class Practicalapplet_2 extends Applet {
    public void init() {
        String flags[] = { "English", "Marathi", "Hindi", " Sanskrit", "Urdu", "Arabic", "Ukranian", "Jpanese",
                "Chinese", "Malyanam", "Punjabi" };

        JLabel jb = new JLabel("Country");
        jb.setBounds(20, 20, 100, 20);

        JComboBox jc = new JComboBox<>(flags);
        jc.setBounds(20, 20, 100, 20);

        add(jb);
        add(jc);
        setVisible(true);

    }
}

/*
 * <html> <head> <title>Login</title> </head> <body> <h3>Login</h3> <applet
 * code="Practicalapplet_2.class" width="450" height="430"
 * alt="Error loading applet!"> </applet> </body> </html>
 */
