package mani;
import javax.swing.*;
public class manu extends Thread{
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("current thread name: " +Thread.currentThread().getName());  
		System.out.println(" thread priority:  "+Thread.currentThread().getPriority());
		//super.run();
	}

	public static void main(String args[])
	{	manu m1 = new manu();
		manu m2 = new manu();
		manu m3 = new manu();
		m1.setPriority(Thread.MIN_PRIORITY);
		m2.setPriority(Thread.NORM_PRIORITY);
		m3.setPriority(Thread.MAX_PRIORITY);
		m3.start();
		m2.start();
		m1.start();
	

		 
		
		//System.out.println("\n hi");
	}

}
