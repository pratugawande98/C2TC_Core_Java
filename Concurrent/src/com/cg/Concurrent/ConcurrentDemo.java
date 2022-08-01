package com.cg.Concurrent;

import java.util.concurrent.locks.ReentrantLock;

public class ConcurrentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ReentrantLock I=new ReentrantLock();
I.lock();
System.out.println(I.isLocked());
I.unlock();
System.out.println(I.isHeldByCurrentThread());
System.out.println(I.getHoldCount());
System.out.println(I.getQueueLength());

	
	}
	

}
