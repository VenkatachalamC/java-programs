class TrainTicket extends Thread{
static int Available=1;
void book(){
if(Available!=0)
{
System.out.println("Successfully Booked..");
Available=Available-1;
}
else
System.out.println("No Availability...");
}
public void run()
{
book();
try{
Thread.sleep(500);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
public class Thread4{
public static void main(String args[])
{
TrainTicket obj=new TrainTicket();
Thread t1=new Thread(obj);
Thread t2=new Thread(obj);
t1.start();
t2.start();
}
}