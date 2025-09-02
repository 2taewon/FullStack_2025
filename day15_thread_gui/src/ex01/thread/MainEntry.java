package ex01.thread;

public class MainEntry {
	public static void main(String[] args) {
//		Thread t1 = new Thread("t1");
		UserThread t1 = new UserThread("t1");
		Thread t2 = new UserThread("t2");
		Thread t3 = new UserThread("t3");
		
		t1.setPriority(Thread.MIN_PRIORITY); // 1 (정수 값들이 미리 세팅되어있다.)
		t2.setPriority(Thread.NORM_PRIORITY); // 5
		t3.setPriority(Thread.MAX_PRIORITY); // 10
		
		System.out.println(Thread.currentThread().getName()); // main 
		System.out.println(Thread.currentThread().getState()); //Runnable
//		t2.run(); // 명시적으로 thread 상태가 아님. 
		t1.start(); //명시적으로 run을 부르지 않아도 run() 메서드가 유도되기 때문에 userthread에 있는 run()을 출력
		t2.start(); 
		t3.start(); 
//		System.out.println(t1);
	}
}
