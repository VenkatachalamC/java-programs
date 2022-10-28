import java.io.*;
import java.util.*;
class Employee implements Serializable{
int empId;
String name;
String DOB;
String designation;
double salary;
void getdata()
{
Scanner s=new Scanner(System.in);
System.out.print("Enter Name:");
name=s.next();
System.out.print("Enter ID:");
empId=s.nextInt();
System.out.print("Enter DoB:");
DOB=s.next();
System.out.print("Enter Designation:");
designation=s.next();
System.out.print("Enter Salary:");
salary=s.nextDouble();
}
void putdata()
{
System.out.println("Name:"+name);
System.out.println("ID:"+empId);
System.out.println("DOB:"+DOB);
System.out.println("Designation:"+designation);
System.out.println("Salary:"+salary);
}
}
class Ex2{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Vector<Employee> e=new Vector<>();
int n;
System.out.println("Enter Number of Employees:");
n=sc.nextInt();
try{
ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream("C:\\Users\\Laptop\\Desktop\\employee.txt"));
Employee []emp=new Employee[n];
for(int i=0;i<n;i++)
{
emp[i]=new Employee();
emp[i].getdata();
e.add(emp[i]);
}
o.writeObject(e);
System.out.println("Stored the employee Details in a file..");
o.close();
}
catch(Exception ex)
{
System.out.println(ex);
}
String ename;
System.out.println("Enter The name You want to search:");
ename=sc.next();
try{
ObjectInputStream i=new ObjectInputStream(new FileInputStream("C:\\Users\\Laptop\\Desktop\\employee.txt"));
Vector<Employee> de=(Vector<Employee>)i.readObject();
Iterator<Employee> iter=de.iterator();
while(iter.hasNext())
{
Employee e1=(Employee)iter.next();
if(e1.name.equals(ename))
{
System.out.println("Match found");
e1.putdata();
}
}
i.close();
}
catch(Exception ex)
{
System.out.println(ex);
}
}
}
