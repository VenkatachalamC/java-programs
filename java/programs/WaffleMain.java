class Waffle{
String flavour;
int price;
public Waffle(String f,int p)
{
flavour=f;
price=p;
}
public boolean equals(Waffle w)
{
if(flavour==w.flavour && price==w.price)
return true;
else
return false;
}
public String toString()
{
return "The flavour is:"+flavour+"\nThe price is:"+price;
}
}
class WaffleMain{
public static void main(String args[])
{
Waffle obj1=new Waffle("ButterScotch",100);
Waffle obj2=new Waffle("Vannila",50);
System.out.println(obj1.toString());
System.out.println(obj2.toString());
if(obj1.equals(obj2))
{
System.out.println("Equal");
}
else
System.out.println("Not Equal");
}
}