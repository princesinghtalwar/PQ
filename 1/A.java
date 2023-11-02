 class sub implements Runnable{
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread 1: "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
 
 class sub2 implements Runnable{
		
		public void run() {
			for(int i=0;i<10;i++) {
				System.out.println("Thread 2: "+i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
 
 public class A {
	 public static void main(String[] args) {
			Runnable obj = new sub();
			Runnable obj2 = new sub2();
			Thread t1 = new Thread(obj);
			Thread t2 = new Thread(obj2);
			t1.start();
			t2.start();
			
		}
 }

