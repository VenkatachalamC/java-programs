import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class SimpleCalculator extends JFrame implements ActionListener{
JButton b1,b2,b3,b4;
JTextField t1,t2;
JLabel l;
public SimpleCalculator()
{
b1=new JButton("Add");
b2=new JButton("Sub");
b3=new JButton("Mul");
b4=new JButton("Div");
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
setSize(270,270);
setLayout(new FlowLayout());
setVisible(true);
t1=new JTextField(20);
t2=new JTextField(20);
l=new JLabel("result");
add(t1);
add(t2);
add(b1);
add(b2);
add(b3);
add(b4);
add(l);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e)
{
int a=Integer.parseInt(t1.getText());
int b=Integer.parseInt(t2.getText());
int c=0;
if(e.getSource()==b1)
{
c=a+b;
}
if(e.getSource()==b2)
{
c=a-b;
}
if(e.getSource()==b3)
{
c=a*b;
}
if(e.getSource()==b4)
{
c=a/b;
}
l.setText(" "+c);
}
public static void main(String args[])
{
SimpleCalculator ob=new SimpleCalculator();
}
}