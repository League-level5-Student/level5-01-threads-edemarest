package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker implements Runnable {
	ConcurrentLinkedQueue<Task> queue;
	
	Worker(ConcurrentLinkedQueue<Task> queue){
		this.queue = queue;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(!queue.isEmpty()) {
			Task t = queue.remove();
			t.perform();
		}
	}


}
