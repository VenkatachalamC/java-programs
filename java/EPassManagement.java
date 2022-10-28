import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

class EPass  //EPass class
{
 int Epass_id=0;
 int addpass;
 String name,fromdis,todis,vehicletype,status,number;
 
  public EPass() //Constructor
 {
 number=null;
 addpass=0;
 name=fromdis=todis=vehicletype=null;
 status="Pending";
 }
 public String toString() //toString Method
{
 return String.format("EPass id:"+Epass_id+"\n"+"Name:"+name+"\n"+"From:"+fromdis+"\n"+"to:"+todis+"\n"+"type:"+vehicletype+"\n"+"Number:"+number+"\n"+"Additional Passengers:"+addpass+"\n"+"Status:"+status+"\n");
}
}

public class EPassManagement extends JFrame implements ActionListener //EPassManagement Class
{
 JFrame f;
 JLabel l1,l2,l3,l4,l5,l6,l7;
 JTextField t1,t2,t3,t4,t5,t6;
 JTextArea ta;
 JComboBox jc;
 JButton b1,b2,b3,b4,b5;
 ArrayList<EPass> list=new ArrayList<EPass>(); //Array list to store values
int n;

  public EPassManagement()  //constructor
 {
  f=new JFrame("Travel E-Pass Management");
  t1=new JTextField(20);
  t2=new JTextField(20);
  t3=new JTextField(20);
  t4=new JTextField(20);
  t5=new JTextField(20);
  l1=new JLabel("Traveller name");
  l2=new JLabel("From district");
  l3=new JLabel("To district");
  l4=new JLabel("Vehicle Type");
  l5=new JLabel("Vehicle number");
  l6=new JLabel("Additional Passengers");
  ta=new JTextArea(100,100);
  String str[]={"Car","Bike","Van"};
  jc=new JComboBox(str);
  b1=new JButton("Register Pass");
  b2=new JButton("Update Status");
  b3=new JButton("View Approved");
  b4=new JButton("View Rejected");
  b5=new JButton("View All");
  f.setSize(950,600);
  f.setLayout(new FlowLayout());
  f.setVisible(true);
  b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
  b4.addActionListener(this);
  b5.addActionListener(this);
  f.add(l1);
  f.add(t1);
  f.add(l2);
  f.add(t2);
  f.add(l3);
  f.add(t3);
  f.add(l4);
  f.add(jc);
  f.add(l5);
  f.add(t4);
  f.add(l6);
  f.add(t5);
  f.add(b1);
  f.add(b2);
  f.add(b3);
  f.add(b4);
  f.add(b5);
  f.add(ta);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
 void AddEPass(EPass e) //method to add details
{
  n=n+1;
  e.Epass_id=n;
  list.add(e);
}

void UpdateStatus() //method to update status
{
for(EPass e:list)
{
if(e.vehicletype.equals(" Bike")&& e.addpass<=1)
e.status="Approved";
else if(e.vehicletype.equals(" Car")&& e.addpass<=3)
e.status="Approved";
else if(e.vehicletype.equals(" Van")&& e.addpass<=8)
e.status="Approved";
else
e.status="Rejected";
}
}
void ViewAllEPass() //method to view all EPass 
{
String s=new String();
String s1=new String();
for(EPass e:list)
{
s=e.toString();
s1+=s;
}
ta.setText(s1);
}
void ViewApproved()  //method to view approved EPass
{
String s;
String s1=new String();
for(EPass e:list)
{
if(e.status=="Approved")
{
s=e.toString();
s1+=s;
}
}
ta.setText(s1);
}
void ViewRejected() //method to view Rejected EPass
{
String s;
String s1=new String();
for(EPass e:list)
{
if(e.status=="Rejected")
{
s=e.toString();
s1+=s;
}
}
ta.setText(s1);
}
public void check(JTextField t) //method to check for empty textfields and throw exception
{
try{
if(t.getText().equals(null))
throw new Exception("Cannot be Empty");
}
catch(Exception e)
{
System.out.println(e);
}
}
public void actionPerformed(ActionEvent e) //action performed when button is pressed
{
EPass e1=new EPass();
e1.name=t1.getText();
e1.fromdis=t2.getText();
e1.todis=t3.getText();
e1.vehicletype=" "+jc.getItemAt(jc.getSelectedIndex());
e1.number=t4.getText();
e1.addpass=Integer.parseInt(t5.getText());

if(e.getSource()==b1) //if add button is pressed 
{
check(t1);
check(t2);
check(t3);
check(t4);
check(t5);
AddEPass(e1);
}
if(e.getSource()==b2) //if update button is pressed
UpdateStatus();
if(e.getSource()==b3) //if view Approved button is pressed
ViewApproved();
if(e.getSource()==b4) //if view rejected button is pressed
ViewRejected();
if(e.getSource()==b5) //if view all button is pressed
ViewAllEPass();
}

public static void main(String[] args) //main method
{
 EPassManagement epm=new EPassManagement(); //object to EPassManagement class
}
}


 
