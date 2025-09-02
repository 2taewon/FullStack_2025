package ex05.syncronized;

public class SimpleThread { // outerClass
	
	static void threadMessage(String message) {
		String threadName = Thread.currentThread().getName();
		System.out.printf("%s : %s \n\n", threadName, message);
	}
	
	static class MessageLoop implements Runnable { //innerClass

		@Override
		public void run() {
			String[] importantInfo = {"aa a", "bb b", "cc c", "dd d"};
			try {
				for(int i = 0; i< importantInfo.length; i++){
					Thread.sleep(4000);
					threadMessage("I wasn't done!!");
					}
				}catch(Exception e) {
					e.printStackTrace();
			}
		} 
		
	}// end MessageLoop class - inner class
	public static void main(String[] args) throws InterruptedException {
		long parience = 1000 * 60 * 60;
		
		if(args.length > 0) {
			try {
				parience = Long.parseLong(args[0]) * 1000;
			}catch (Exception e) {
				System.out.println("argument integer input");
				System.exit(1); // 강제 종료
			}
		} // end if 
		threadMessage("Start MessageLoop thread test");
		long startTime = System.currentTimeMillis();
		Thread t = new Thread(new MessageLoop());
		t.start(); // run 메서드 유도

		while(t.isAlive()) {
			threadMessage("still waitting...");
			t.join(1000);
			
			if(((System.currentTimeMillis()- startTime) > parience) && t.isAlive()){
				threadMessage("tired  of waitting...");
				t.interrupt();
				t.join();
			}
		}
		threadMessage("Finally ...");
	}
}
