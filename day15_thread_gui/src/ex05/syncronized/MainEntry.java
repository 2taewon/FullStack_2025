package ex05.syncronized;

class Atm {
	private int money;
	
	public Atm(int money) {
		this.money = money;
	}
	
	//입금함수
	public void deposit(int amount, String name) {
		money += amount;
		System.out.println(name + " :입금금액 " + amount);
	}
	
	//출금함수
	public void withdraw(int amount, String name) {
		synchronized (this) {
			if((money - amount) > 0 ) {
				
				Thread.yield(); //
				money -= amount;
				System.out.println(name + " : 출금금액" + amount);
			}
			else {
				System.out.println(name + " : 출금 할 수 없음.");
			}
		} // end synchronized
	}
	
	//통장 잔고 확인 함수 
	public void getMoney() {
		System.out.println("          잔액은 : " + money);
	}
} // Atm

class UserAtm extends Thread{
	Atm obj;
	boolean flag = false;
	
	public UserAtm(Atm obj, String name) {
		super(name);
		this.obj = obj;
	}
	
	@Override
	public void run() { // 스레드 실행부(구현부)
		for (int i = 0; i < 2; i++) {
			try {
				sleep(50);
			} catch (InterruptedException e) {e.printStackTrace();}
		
			if(flag) {
			obj.deposit(((int)Math.random() * 10 + 2)*100, getName());
		} else {
			obj.withdraw(((int)Math.random() * 10 + 2)*100, getName());		
		} //end if
		flag = true;
		obj.getMoney();
			} //end for
//		super.run();
	}
	
}//end UserAtm

public class MainEntry {
	public static void main(String[] args) {
		Atm at = new Atm(1000);
		UserAtm user1 = new UserAtm(at, "김연아");
		UserAtm user2 = new UserAtm(at, "박태환");
		UserAtm user3 = new UserAtm(at, "손흥민");
		
		user1.start();
		user2.start();
		user3.start();
		
	}
}
