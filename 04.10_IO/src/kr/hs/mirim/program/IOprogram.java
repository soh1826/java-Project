package kr.hs.mirim.program;

import java.io.*;
import java.util.*;

public class IOprogram {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		String  in=sc.nextLine();
//		System.out.println(in);
//		System.err.println(in);
		
		int bt;
		try {
			while((bt=System.in.read()) !=-1)
			System.out.print((char)bt);
		} catch (IOException e) {
			System.err.println(e);
		}
	}

}
