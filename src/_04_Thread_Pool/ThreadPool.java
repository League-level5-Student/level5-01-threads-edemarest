package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadPool {
	ConcurrentLinkedQueue<Task> queue;
	Thread[] ts;
	public ThreadPool(int n) {
		// TODO Auto-generated constructor stub
		ts =  new Thread[n];
		queue = new ConcurrentLinkedQueue<Task>();
		for(int i = 0 ; i < ts.length; i++) {
			ts[i] = new Thread(new Worker(queue));
		}
		
	}

	public void addTask(Task t) {
		// TODO Auto-generated method stub
		queue.add(t);
	}

	public void start(){
		for(int i = 0; i < ts.length; i++) {
			ts[i].start();
			try {
				ts[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
