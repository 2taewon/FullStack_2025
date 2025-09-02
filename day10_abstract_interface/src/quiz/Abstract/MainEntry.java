package quiz.Abstract;

public class MainEntry {

	public static void main(String[] args) {
		
//		Trans[] t = new Trans[4];
//		
//		Object[] name = {new Subway(), new Bus(), new Plain()};
//		
//		String [] str = {
		
		
		
		Trans t = new Subway();
		t.show("Subway");
		
		new Bus().show("Bus");
		new Plain().show("Plain");
	}

}
