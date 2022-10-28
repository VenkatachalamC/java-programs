import java.util.*;
class EmployeeMap{
String name,hobbie;
public EmployeeMap(String name,String hobbie)
{
this.name=name;
this.hobbie=hobbie;
}
public static void main(String args[])
{
EmployeeMap ob;
int id;
Scanner s=new Scanner(System.in);
EmployeeMap e1=new EmployeeMap("venkat","Drawing");
EmployeeMap e2=new EmployeeMap("John","playing");
EmployeeMap e3=new EmployeeMap("matt","Reading");
EmployeeMap e4=new EmployeeMap("mark","Sleeping");
Map<Integer,EmployeeMap> map=new HashMap<Integer,EmployeeMap>();
map.put(1,e1);
map.put(2,e2);
map.put(3,e3);
map.put(4,e4);
int i;
do{
System.out.println("\n1.Search\n2.Delete\n3.ShowAll\n4.exit");
i=s.nextInt();
switch(i)
{
case 1:
System.out.println("Enter the id:");
id=s.nextInt();
for(Map.Entry<Integer,EmployeeMap> e:map.entrySet())
{
if(e.getKey()==id)
{
ob=e.getValue();
System.out.println("ID:"+id+"\nName:"+ob.name+"\nHobbie:"+ob.hobbie);
}
}
break;
case 2:
System.out.println("Enter the Id to be deleted:");
id=s.nextInt();
map.remove(id);
System.out.println("Successfully Deleted...");
break;
case 3:
System.out.println("The employee details are:");
for(Map.Entry<Integer,EmployeeMap> f:map.entrySet())
{
id=f.getKey();
ob=f.getValue();
System.out.println("Id:"+id+"\nName:"+ob.name+"\nHobbie:"+ob.hobbie);
}
break;
case 4:System.out.println("Exiting...");
break;
default:System.out.println("Invalid Option");
}
}while(i<4);
}
}
