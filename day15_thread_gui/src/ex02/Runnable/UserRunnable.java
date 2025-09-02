package ex02.Runnable;

public class UserRunnable implements Runnable {

	String name;
	
	public UserRunnable(String name){
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i = 1; i<11; i++) {
			if( i == 3) {
				try {
					Thread.sleep(1000); // 1/1000 ==> 1초, 예외 발생
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
				System.out.println(name);
			} // if end
			System.out.println(i);
		} // for end 
		
	}

}
