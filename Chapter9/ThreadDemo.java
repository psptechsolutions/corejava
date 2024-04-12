package com.multithread;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread ct = Thread.currentThread();
		System.out.println("Current Thread :" +ct);
		System.out.println("Thread Name :" +ct.getName());
		System.out.println("Thread Priority :" +ct.getPriority());
		System.out.println("ThreadGroup :" +ct.getThreadGroup());
		
		
		

	}

}
