import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Converter extends JFrame implements ActionListener
{
JButton b1,b2;
JTextField t;
JLabel l1,l2;
public Converter()
{
b1=new JButton("Celcius");
b2=new JButton("Fahrenheit");
t=new JTextField(10);
l1=new JLabel("Which Unit you want to convert?");
l2=new JLabel(" ");
add(t);
add(l1);
add(b1);
add(b2);
add(l2);
setLayout(new FlowLayout());
setSize(200,200);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
b1.addActionListener(this);
b2.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
float f=Float.parseFloat(t.getText());
float x;
if(e.getSource()==b1)
{
x=(f-32)*5/9;
l2.setText("The Temprature in celcius is "+x);
}
if(e.getSource()==b2)
{
x=(f*9/5)+32;
l2.setText("The Temprature in Fahrenheit is "+x);
}
}
public static void main(String args[])
{
Converter obj=new Converter();
}
}






