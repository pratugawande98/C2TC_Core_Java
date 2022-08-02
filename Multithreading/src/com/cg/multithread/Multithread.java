package com.cg.multithread;
class ChildThread extends Thread{ //Thread
	@Override
	public void run()  
	{ 
		for(int i=0; i<10; i++) 
		{
			System.out.println("I am MyThread");
		}	
	}
}
public class Multithread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildThread t = new ChildThread();
		t.start();
		
		for(int i=0; i<10; i++) 
		{
			System.out.println("I am Main thread");
		}
	}

}
