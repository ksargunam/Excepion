package org.error;

public class Tryh {
	public static void main(String[] args) {
		System.out.println(4/2);
		
		try {
			System.out.println(6/2);
            
             String s = "@hello";
             char charAt = s.charAt(0);
             System.out.println(charAt);
             
             System.out.println(20/1);
			
		} catch (ArithmeticException e) {
			System.out.println("Dont divid by zero");
		}
		finally {
			System.out.println("end of the code");
		}
	}

}
