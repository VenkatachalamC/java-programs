import java.util.*;
class Product extends Exception
{
int productID;
String productName;
double cost;
Boolean availableStatus;
Product()
{
}
Product(String str)
{
super(str);
}
Product(int a,String b,double c)
{
productID=a;
productName=b;
cost=c;
availableStatus=true;
}
}
public class ProductDemo 
{
Scanner sc= new Scanner(System.in); 
void display(Product[] product,int i)
{
System.out.println(product[i].cost);
System.out.println(product[i].productName);
System.out.println(product[i].productID);
}
void search(Product[] product,int r)
{
Scanner sc= new Scanner(System.in); 
try
{
int count=0;
for(int i=0;i<5;i++)
{
if(r>5)
{
Product a=new Product("ProductNotFoundException");
throw a;
}
else if(product[i].productID == r)
{
System.out.println(product[i].availableStatus);
System.out.println(product[i].productName);
System.out.println(product[i].cost);
break;
}
else
{
continue;
}
}
}catch(Product e)
{
e.printStackTrace(); 
}
}
public static void main(String args[])
{
int n,a=5;
Product [] product = new Product [5];
ProductDemo hello = new ProductDemo(); 
product[0]=new Product(1,"bottle",10);
product[1]=new Product(2,"pad",20);
product[2]=new Product(3,"pen",30);
product[3]=new Product(4,"pencil",40);
product[4]=new Product(5,"rubber",50);
System.out.println("Enter the product id");
Scanner sc= new Scanner(System.in); 
n=sc.nextInt();
hello.search(product,n);
}
}

