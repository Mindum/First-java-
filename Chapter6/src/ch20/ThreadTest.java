package ch20;



class MyThread implements  Runnable{
	
	public void run() {
		int i;
		for(i = 1; i<=200;i++) {
			System.out.println(i+"\t");
		}
	}
}
public class ThreadTest {

	public static void main(String[] args) {

		
		System.out.println(Thread.currentThread()+"start");
		
		MyThread runnable = new MyThread();
		Thread th1 = new Thread(runnable);
		Thread th2 = new Thread(runnable);
		
		
		System.out.println(Thread.currentThread()+"end");
		
		
		Runnable run = new Runnable() {

			@Override
			public void run() {

				System.out.println("run");
			}
		}
	}
}

