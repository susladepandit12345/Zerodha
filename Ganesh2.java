package practice;

public class Ganesh2 {
	public static float add() { //static method return type
		float a = 84.8f;
		float b = 64;
		float v = a + b;
		return v;
	}

	public int sub() { //non static method return type
		int a = 63;
		int b = 46;
		int sub = a - b;
		return sub;
	}

	public static String div() { //static method return type
		String num = "welcome to java";
		return num;
	}

	public boolean sam() {//non static method return type
		boolean no = true;
		return no;
 }public static void main(String[] args) {
	    float abc = add();
	    String d= div();
	      Ganesh2 ref=new  Ganesh2();
	     int cd = ref. sub();
	boolean jan = ref. sam();
	System.out.println(abc);
	System.out.println(d);
	System.out.println(cd );
	System.out.println(jan );
}
}
