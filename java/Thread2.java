import java.util.*;
class Bank{
double balance;
Scanner s=new Scanner(System.in);
void deposit()
{
double Amt;
System.out.println("Enter Amount:");
Amt=s.nextDouble();
balance+=Amt;
System.out.println("deposit Successfull...\nbalance:"+balance);
}
void withdraw(){
double Amt;
System.out.println("Enter Amount to withdraw:");
Amt=s.nextDouble();
if(Amt>balance)
{
System.out.println("low balance...");
}
else{
balance-=Amt;
System.out.println("Withdraw Successfull...\nbalance:"+balance);
}
}
}
class Thread2 extends Thread{
Scanner s=new Scanner(System.in);
synchronized void menu()
{
Bank B=new Bank();
int a=0;
System.out.println("Welcome "+Thread.currentThread().getName());
while(a<=2){
System.out.println("1.Withdraw\n2.Deposit\n3.exit");
a=s.nextInt();
switch(a)
{
case 1:B.withdraw();
break;
case 2:B.deposit();
break;
default:System.out.println("Thankyou....");
break;
}
}
}
public void run(){
menu();
try{
Thread.sleep(500);
}catch(Exception e)
{
System.out.println(e);
}
}
public static void main(String args[])
{
Thread2 obj=new Thread2();
Thread t1=new Thread(obj,"john");
Thread t2=new Thread(obj,"Matt");
t1.start();
t2.start();
}
}
