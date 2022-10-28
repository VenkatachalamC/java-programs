import java.io.*;
import java.util.*;
class MyMain{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
File num=new File("C:\\Users\\Laptop\\Desktop\\numbers.txt");
File odd=new File("C:\\Users\\Laptop\\Desktop\\odd.txt");
File even=new File("C:\\Users\\Laptop\\Desktop\\even.txt");
try{
num.createNewFile();
odd.createNewFile();
even.createNewFile();
}
catch(Exception e)
{
System.out.println(e);
}
try{
FileOutputStream fout=new FileOutputStream(num);
int n;
System.out.println("Enter numbers\nEnter -1 to stop");
do{
n=s.nextInt();
if(n!=-1)
fout.write(n);
}while(n!=-1);
fout.close();
System.out.println("Numbers File Updated..");
}catch(Exception e)
{
System.out.println(e);
}
try{
FileInputStream fin=new FileInputStream(num);
FileOutputStream f1=new FileOutputStream(odd);
FileOutputStream f2=new FileOutputStream(even);
int i;
while((i=fin.read())!=-1)
{
if(i%2==0)
f2.write(i);
else
f1.write(i);
}
fin.close();
f1.close();
f2.close();
}
catch(Exception e)
{
System.out.println(e);
}
try{
FileInputStream f3=new FileInputStream(odd);
FileInputStream f4=new FileInputStream(even);
int j;
System.out.println("Odd File Contains...");
while((j=f3.read())!=-1)
{
System.out.println((int)j);
}
System.out.println("Even file contains....");
while((j=f4.read())!=-1)
{
System.out.println((int)j);
}
f3.close();
f4.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}

