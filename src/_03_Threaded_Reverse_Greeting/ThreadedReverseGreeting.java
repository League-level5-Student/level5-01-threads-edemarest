package _03_Threaded_Reverse_Greeting;

public class ThreadedReverseGreeting {
	/*
	 * The goal of this assignment is to create a chain of threads. Thread 1 will create Thread 2, 
	 * Thread 2 will create Thread 3, Thread 3 will create Thread 4 and so on up to 50 threads.
	 * We will accomplish this by creating our own customized Runnable.
	 * 
	 * We will print a greeting from each thread using the thread number like so:
	 * 
	 * Hello from thread number: 1
	 * Hello from thread number: 2
	 * Hello from thread number: 3
	 * Hello from thread number: 4
	 * Hello from thread number: 5
	 * Hello from thread number: 6
	 * Hello from thread number: 7
	 * etc...
	 */
	
	
	
	public static void main(String[] args) {
		//5. Create the first thread and initialize it with an object of the ThreadedGreeter class.
		//   The ThreadedGreeter object should be initialized with 1.
		Thread t1 = new Thread(new ThreadedGreeter(1));
		
		//6. Start and join the thread. Did you get the required output?
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
