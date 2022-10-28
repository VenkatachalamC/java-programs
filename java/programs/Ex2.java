import java.util.Scanner;
public class Ex2 {
public static void main (String[] args)
{
int m;
char choice,l;
String x=" ",y=" ";
Scanner input = new Scanner(System.in);
System.out.println("Enter the word");
String s = input.next();
int count=s.length();
for(int i=0;i<count;i++)
{
m=(int)s.charAt(i);
System.out.println(m);
m=(m-30);
l=(char)m;
x=String.valueOf(l);
y=y.concat(x);	
}
System.out.println(y);
System.out.println("Press 1 for displaying uppercase version .");
System.out.println("Press 2 for displaying the lowercase version.");
String b = input.next();
choice = b.charAt(0);
switch(choice)
{
case '1':
System.out.println(y.toUpperCase());
break;
case '2':
System.out.println(y.toLowerCase());
break;
default:
System.out.println("Error");
}
}
}
