package quiz.Abstract;

public class Plain extends Trans {

	@Override
	public String start(String x) {
		return x;
	}

	@Override
	public String stop(String x) {
		return x;
	}
	
	@Override
	public void show(String name) {
			
			System.out.println(name + "가" );
	}

}
