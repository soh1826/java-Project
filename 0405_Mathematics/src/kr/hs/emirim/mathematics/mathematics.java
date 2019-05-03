package kr.hs.emirim.mathematics;

import java.util.Random;

public class mathematics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.abs(25));
		System.out.println(Math.abs(-25));
		System.out.println(Math.abs(25.5));
		System.out.println(Math.abs(-25.5));
		System.out.println("======================================");
		System.out.println(Math.round(25));
		System.out.println(Math.round(25.3));
		System.out.println(Math.round(25.5));
		System.out.println(Math.round(-25.4));
		System.out.println(Math.round(-25.525));
		System.out.println(Math.round(-25.6));
		System.out.println("======================================");
		System.out.println(Math.pow(3, 2));
		System.out.println(Math.pow(3.0f, 2.0f));
		System.out.println(Math.pow(5.0, 2));
		System.out.println(Math.pow(-5.0, -3.2));
		System.out.println("======================================");
		System.out.println(Math.sqrt(9));
		System.out.println(Math.sqrt(9.0f));
		System.out.println(Math.sqrt(9.0));
		System.out.println(Math.sqrt(9-9.0));
		System.out.println("======================================");
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(  (int)(Math.random()*5 ));
		System.out.println((int)Math.random()*5);
		System.out.println((int)Math.random()*10);
		System.out.println((int)Math.random()*100);
		System.out.println("======================================");
		
		Random ra=new Random();
		int ran=ra.nextInt(100);
		int start=100;
		int end=999;
		int ran100to999=ra.nextInt(end-start+1)+start;
	}

}
