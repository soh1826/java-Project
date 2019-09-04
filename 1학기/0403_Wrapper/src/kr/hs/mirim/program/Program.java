package kr.hs.mirim.program;

public class Program {

	public static void main(String[] args) {
		Integer in1 = new Integer(100);
		Integer in2 = new Integer(100);
		Integer in3 = new Integer(200);
		System.out.println("in1.equals(in2)--> "+in1.equals(in2));
		System.out.println("in1.equals(in3)-->"+in1.equals(in3));
		System.out.println("==============================================");
		System.out.println(Integer.valueOf("123"));
		System.out.println(Double.valueOf("123.456"));
		System.out.println("==============================================");
		System.out.println(Integer.parseInt("456"));
		System.out.println(Double.parseDouble("789.123"));
		System.out.println(new Integer(100).intValue());
		System.out.println(new Double(3.31).doubleValue());
		System.out.println("==============================================");
		
		
	}

}
