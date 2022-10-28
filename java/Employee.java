import java.util.*;
class Employee{
public static void main(String args[])
{
HashSet<String> ename=new HashSet<String>();
Scanner s=new Scanner(System.in);
String name;
char ch='y';
while(ch=='y'||ch=='Y')
{
System.out.println("Enter employee name:");
name=s.next();
ename.add(name);
System.out.println("Enter one more name?(y/n):");
ch=s.next().charAt(0);
}
Iterator<String> i=ename.iterator();
while(i.hasNext())
{
System.out.println(i.next());
}
}
}