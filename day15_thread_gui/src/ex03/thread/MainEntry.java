package ex03.thread;

public class MainEntry {
	public static void main(String[] args) throws InterruptedException { // main도 하나의 thread다. 
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		
//		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		Thread.State state = Thread.currentThread().getState();
		
//		if(id) {
		Thread.sleep(2000);
		Thread.currentThread();
//		}
		int priority = Thread.currentThread().getPriority();
		System.out.println("현재 스레드 ID : " + id);
		System.out.println("현재 스레드 Name : " + name );
		System.out.println("현재 스레드 State : " + state );
		System.out.println("현재 스레드 Priority : " + priority );
		
	}
}
