package ex02.Runnable;

public class MainEntry {
	public static void main(String[] args) {
		
		new Thread(new UserRunnable("u1")).start();
		new Thread(new UserRunnable("u2")).start();
		new Thread(new UserRunnable("u3")).start();
		
		
//		UserRunnable u1 = new UserRunnable("u1");
//		Thread t1 = new Thread(u1);
//		t1.start();
	}
}
