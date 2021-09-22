
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
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        Container container;
        container = frame.getContentPane();
        container.setLayout(new FlowLayout());
        String flags[] = { "France", "Germany", "Italy", "Japan", "New York", "Chicago", "Houston", "Denver",
                "Los Angeles", "Seattle", "London", "Paris", "New Delhi", "Hong Kong", "Tokyo", "Sydney" };

        JLabel jb = new JLabel("Country");
        jb.setBounds(20, 20, 100, 20);

        JList jlist = new JList<>(flags);
        jlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane jscrlp = new JScrollPane(jlist);
        jscrlp.setPreferredSize(new Dimension(120, 90));

        JComboBox jc = new JComboBox<>(flags);
        jc.setBounds(20, 20, 100, 20);

        container.add(jb);
        container.add(jc);
        container.add(jscrlp);
        frame.setVisible(true);

    }
}

/*
 * <html> <head> <title>Login</title> </head> <body> <h3>Login</h3> <applet
 * code="Practicalapplet_2.class" width="450" height="430"
 * alt="Error loading applet!"> </applet> </body> </html>
 */
