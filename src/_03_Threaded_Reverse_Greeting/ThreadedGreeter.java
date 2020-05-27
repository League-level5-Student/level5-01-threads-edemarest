package _03_Threaded_Reverse_Greeting;

class ThreadedGreeter implements Runnable{
	int threadNum;
	
	ThreadedGreeter(int threadNum){
		this.threadNum = threadNum;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//1. Create a new class called ThreadedGreeter that implements the Runnable interface.
		//   Be sure to implement the run() method.
		
		//2. In the ThreadedGreeter class, create a member variable of type int. 
		//   This variable will contain the thread number. Add a constructor that will 
		//   initialize the value of this variable
		
		//3. In the run method of the ThreadedGreeter class, print the message using the member variable as the thread number.
		//   If the member integer is less than or equal to 50, create a new thread. 
		//   Pass in a new object of the ThreadedGreeter class with the value of the member variable plus one.
		
		//4. Start the thread and then use the join() method to make the parent thread wait for this thread to finish.
		
		System.out.println("Hello from thread #"+threadNum);
		Thread t;
		if(threadNum<50) {
			t = new Thread(new ThreadedGreeter(threadNum+1));
			t.start();
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("could not join");
			}
		}
		
	}	
}
