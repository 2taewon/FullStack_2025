package ex01.thread;

public class UserThread extends Thread {
	
		String name;
		
		public UserThread(String name) {
			this.name = name;
		}

		@Override
		public void run() { //스레드 실행부(구현부)
			
			for(int i = 1; i<11; i++) {
				if( i == 3) {
					try {
						sleep(1000); // 1/1000 ==> 1초, 예외 발생
					} catch (InterruptedException e) {
						e.printStackTrace();
					} 
					System.out.println(name);
				}
				System.out.println(i);
			}
			
//			System.out.println("run() call ~~" + name );
		}
		
		
		
		
}
