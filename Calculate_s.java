package day01;

import java.util.Scanner;

public class Calculate_s {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String strArr[] = divideString(sc.nextLine());
		System.out.println(doCalculation(strArr));
	}

	public static int calculation(int firstNUM, char sign, int secondNUM) {
		if(sign == '+') {
			return add(firstNUM,secondNUM);
		}
		if(sign == '-') {

			return minus(firstNUM,secondNUM);
		}
		if(sign == '*') {
			return multiple(firstNUM,secondNUM);
		}
		if(sign == '/'){
			try {
				return divide(firstNUM,secondNUM);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
		return 0;
		
	}
	
	private static int divide(int firstNUM, int secondNUM) {
		// TODO Auto-generated method stub
		return firstNUM / secondNUM;
	}

	private static int multiple(int firstNUM, int secondNUM) {
		// TODO Auto-generated method stub
		return firstNUM * secondNUM;
	}

	private static int minus(int firstNUM, int secondNUM) {
		// TODO Auto-generated method stub
		return firstNUM - secondNUM;
	}

	private static int add(int firstNUM, int secondNUM) {
		// TODO Auto-generated method stub
		return firstNUM + secondNUM;
	}
	
	public static String[] divideString(String str) {
		return str.split(" ");
	}
	
	public static int tointeger(String str) {
		return Integer.parseInt(str);
	}
	
	public static int doCalculation(String[] str) {
		int result = tointeger(str[0]);
		for(int i = 0; i < str.length - 2; i+= 2) {
			result = calculation(result, str[i+1].charAt(0), tointeger(str[i+2]));
		}
		return result;
	}
}


