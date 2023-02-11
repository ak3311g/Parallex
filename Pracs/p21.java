import java.util.*;
class p21 extends Thread 
{ 
	public void run() 
	{ 
		System.out.println("Thread Running..."); 
	} 

	public static void main(String[]args) 
	{ 
		Thread p1 = new Thread(); 
		Thread p2 = new Thread(); 
		Thread p3 = new Thread(); 
		p1.start();
		System.out.println("P1 thread priority : " + p1.getPriority()); 
		System.out.println("P2 thread priority : " + p2.getPriority());  
		System.out.println("P3 thread priority : " + p3.getPriority()); 
		
	} 
}