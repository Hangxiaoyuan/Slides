package pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;


class World {
	
	
	Hello h = new Hello(); // ÒýÓÃ
	
	
	public void fun2() {
//		h.fun1();
//		Hello.fun1();
	}
	
}


public class Hello {
	
	final double PI = 3.14;
	
	public static boolean fun1(int a) {
		if(a < 0) {
			System.out.println("not positive");
			return false;
		}
		return a % 2 == 0;
	}
	
	public static void fun1(String s) {
		
	}
	
	
	public static void main(String[] as) {
		
		// 1 2 3 4
		
//		InputStream is = System.in;
//		InputStreamReader isr = new InputStreamReader(is);
//		BufferedReader br = new BufferedReader(isr);
//		
//		String s;
//		while((s = br.readLine()) != null) {
//			String[] ss = s.split(" ");
//			int result = Integer.valueOf(ss[0]) + 
//					Integer.valueOf(ss[1]) + 
//					Integer.valueOf(ss[2]);
//			// result...
//			System.out.println("Input: " + s);
//		}
//		
//		
//		br.close();
		
		
		Scanner sc = new Scanner(System.in);
		
		int i, r = 0;
		
		while((i = sc.nextInt()) != 0) {
			r += i;
		}
		
		System.out.println(r);
		
		sc.close();
		
//		StringBuffer letters = new StringBuffer(); 			// letters -> S@123
//		letters.append("ABC");
//		
//		char[] numbers = {'4', '2', '3'};
//		System.out.println(letters + " easy as " + String.valueOf(numbers));
//		
//		Arrays.sort(numbers);
//		for(int i = 0; i < 3; ++i)
//			System.out.println(numbers[i]);
		
		
//		System.out.println(fun1(-2));
		
//		boolean b;
		
//		int[][] a = new int[2][3];
//		
//		a[0][0] = 1;
//		a[0][1] = 2;
//		a[0][2] = 3;
//
//		
//		for(int i = 0; i < 2; ++i) {
//			for(int j = 0; j < 3; ++j)
//			System.out.println(a[i][j]);
//		}
		
//		int b[];
//		
//		fun1(1);
		
//		System.out.println(a);
//		System.out.println(as[1]);
		
		
//		int 1;				// 4 Bytes 
//		Integer ii = 2;
//		
//		long l = 0L;			// 8 Bytes
//		Long ll = 2L;
//		
//		
//		
//		float f;				// 4 Bytes
//		double d;				// 8 Bytes
//		
//		d = 1.0f;
//		f = (float) d;
//		
//		long a = l + i;
//		
//		Float ff;
//		Double dd;
//		
//		System.out.println(ll.intValue());
		
		
//		for(int i = 0; i < 10; ++i) {
//			
//		}
		
		//System.out.println("Hello");
	
	}
	
}
