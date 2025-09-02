package quiz.Abstract;

public abstract class Trans {
	String go = "";
	String no = "";
	
	public abstract String start(String x);
	public abstract String stop(String y);
	public abstract void show(String name);
}
