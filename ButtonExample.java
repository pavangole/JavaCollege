import javax.swing.*;
public class ButtonExample{
public static void main(String args[])
{
JFrame a = new JFrame("Computer Engineering");
JButton b1;
b1 = new JButton("Click Me");
b1.setBounds(40,40,200,30);
a.add(b1);
a.setSize(400,400);
a.setLayout(null);
a.setVisible(true);
}
}