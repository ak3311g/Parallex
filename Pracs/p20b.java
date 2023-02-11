import java.util.*;
class A 
{
int i;	
 synchronized void deliver(int i)
 {
   this.i = i;	 
   System.out.println("Data Delivered: " +i);	 
 }
 synchronized int receive()
 {
   System.out.println("Data Received: " + i); 
   return i;
 }
}
class Thread1 extends Thread
{
 A obj;
 Thread1(A obj)
 {
  this.obj = obj;
 }
public void run()
{
 for(int j = 1; j <= 5; j++){
   obj.deliver(j); 	
  }
 }
}
class Thread2 extends Thread 
{
A obj;
Thread2(A obj)
{
 this.obj = obj;
}
public void run()
{
for(int k = 0; k <= 5; k++){
 obj.receive();	
}
 }
}
public class p20b
{
public static void main(String[] args) 
{
A obj = new A();
Thread1 t1 = new Thread1(obj);
Thread2 t2 = new Thread2(obj);
  t1.start();
  t2.start();
 }
}