import java.util.Random;
class Printnumber extends Thread{
public void run()
{
for(int i=0;i<5;i++)
{
Random r=new Random();
int x=r.nextInt(10);
System.out.println("The number is:"+x);
if(x%2==0)
{
Square s=new Square(x);
s.start();
}
else
{
Cube c=new Cube(x);
c.start();
}
try{
Thread.sleep(500);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
}
class Square extends Thread{
int num;
Square(int x)
{
num=x;
}
public void run()
{
System.out.println("The Square is:"+(num*num));
}
}
class Cube extends Thread{
int num;
Cube(int x)
{
num=x;
}
public void run()
{
System.out.println("The cube of the number is:"+(num*num*num));
}
}
public class Thread1{
public static void main(String args[])
{
Printnumber P1=new Printnumber();
P1.start();
}
}

