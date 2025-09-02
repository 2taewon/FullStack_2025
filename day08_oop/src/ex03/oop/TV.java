package ex03.oop;
class Color {
	private String x,y,z;
	
	public Color() {
		x = "빨간색";
	}
	public Color(String x, String y) {
		x = "빨간색";
		y = "주황색";
	}
	public Color(String x, String y, String z) {
		x = "빨간색";
		y = "주황색";
		z = "노란색";
	}
	public String getX() {
		return x;
	}
	public void setX(String x) {
		this.x = x;
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}
	public String getZ() {
		return z;
	}
	public void setZ(String z) {
		this.z = z;
	}
	public void disp() {
		System.out.println("색상은" + x +"\t"+ y + "\t"+z);
	}
}

public class TV {
	private String a, b, c;
	
	public TV() {
		a = "sbs";
	}
	public TV(String a, String b) {
		a = "sbs"; b = "kbs";
	}
	public TV(String a, String b, String c) {
		a = "sbs"; b = "kbs"; c = "mbc";
	}
	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}
	public void display() {
		System.out.println("채널은" + a +"\t"+ b+"\t" + c);
	}
}
