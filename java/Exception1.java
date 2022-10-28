import java.util.*;
class Account_Details extends Exception
{
static long account_number=100000;
int balance=10000;
Account_Details() 
{
} 
Account_Details(String str) 
{
super(str); 
} 
}
class CustomerDetails extends Account_Details 
{
String name,address,age,phone_number;
int withdraw;
long accno;
Scanner sc= new Scanner(System.in); 
CustomerDetails()
{
account_number=++account_number;
accno=account_number;
}
static void isNumber(String s) throws Account_Details
{
for (int i = 0; i < s.length(); i++)
if(Character.isDigit(s.charAt(i)) == true)
{
Account_Details a =new Account_Details("Please enter a valid name"); 
throw a;
}
else
{
continue;
}
}
static void ischaracter(String s) throws Account_Details
{
for (int i = 0; i < s.length(); i++)
if(Character.isDigit(s.charAt(i)) == true)
{
continue;
}
else
{
Account_Details a =new Account_Details("Please enter a valid name"); 
throw a;
}
}
void read()
{
System.out.println("The account number is "+accno);
try
{
System.out.print("Enter the name: ");
name=sc.nextLine();
isNumber(name);
try
{
System.out.println("Enter the age: ");
age=sc.nextLine();
ischaracter(age);
if(age.length()>2||age.length()<2)
{
Account_Details a =new Account_Details("Please enter a valid name"); 
throw a;
}
try
{
System.out.println("Enter the address ");
address=sc.nextLine();
if(address.length()>50)
{
Account_Details a =new Account_Details("Please enter address below 50 characters"); 
throw a;
}
try
{
System.out.println("Enter the phone number ");
phone_number=sc.nextLine();
ischaracter(phone_number);
if(phone_number.length()!=10)
{
Account_Details a =new Account_Details("Please enter valid phone number"); 
throw a;
}
try
{
System.out.println(balance);
System.out.println("Enter the amount to be withdrawn ");
withdraw=sc.nextInt();	
if (balance<withdraw) 
{ 
Account_Details me = new Account_Details("Balance is less than withdrawl amount"); 
throw me; 
}
}catch (Account_Details e){ 
e.printStackTrace(); 
}
}
catch(Account_Details e)
{
e.printStackTrace();
}
}
catch(Account_Details e)
{
e.printStackTrace();
}
}catch(Account_Details e)
{
e.printStackTrace();
}
}
catch(Account_Details e)
{
e.printStackTrace();
}
}
}
public class Exception1
{
public static void main(String args[])
{
    Scanner sc= new Scanner(System.in); 
System.out.println("Enter the number of people");
int n =sc.nextInt();
CustomerDetails [] hello = new CustomerDetails [n];
for (int i = 0; i < n; i++)
{
    hello[i]=new CustomerDetails();
hello[i].read();
}
}
}
 