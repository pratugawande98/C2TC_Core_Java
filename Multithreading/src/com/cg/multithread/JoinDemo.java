package com.cg.multithread;
class Adarsh extends Thread 
{
	@Override
	public void run() 
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("Adarsh Thread");
			
			try 
			{
				Thread.sleep(3000); 
			} 
			catch (InterruptedException e) 
			{
				System.out.println(e);
			}
		}
	}
	
}

public class JoinDemo {

	public static void main(String[] args)throws InterruptedException { //Thread 2 Amol
		Adarsh a = new Adarsh();
		a.start();
		a.join();
		
		for(int i=0; i<10; i++)
		{
			System.out.println("Amol Thread");
		} {
		// TODO Auto-generated method stub

	}

}
}