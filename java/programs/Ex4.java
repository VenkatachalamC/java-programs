import java.util.regex.*;
import java.util.*;
class Aadhar{
public String pat="^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$";
public Pattern p;
public Matcher m;
void check(String s)
{
p=Pattern.compile(pat);
if(s==null)
{
System.out.println("Aadhar number cannot be empty");
}
m=p.matcher(s);
if(m.matches()){
System.out.println("Valid...");
}
else
{
System.out.println("Invalid Aadhar number..");
}
}
}
class Ex4{
public static void main(String args[])
{
Aadhar obj=new Aadhar();
Scanner sc=new Scanner(System.in);
String Ano;
System.out.println("Enter Your Aadhar number:");
Ano=sc.nextLine();
obj.check(Ano);
}
}


