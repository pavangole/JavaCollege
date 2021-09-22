
import javax.swing.*;
import java.awt.*;

public class Practical_2 {

    public static void main(String[] args) {
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
