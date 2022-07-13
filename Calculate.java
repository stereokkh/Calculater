package day01;

import java.util.Arrays;
import java.util.Scanner;

public class Calculate extends Caculater{
	public static void main(String[] args) {
		String value = null;
		Scanner sc = new Scanner(System.in);
		
		value = sc.nextLine();					
		String strArr[] = value.split(" ");	
//		System.out.println(Arrays.toString(strArr));

		
		Calculator cal = new Calculator();
		double val = 0;
		cal.setResult(Integer.parseInt(strArr[0]));
		for(int i=0; i <strArr.length ; i=i+2) {
				if(strArr[i].equals("+")) {
					val = Integer.parseInt(strArr[i+1]);
					cal.plus(val);
				}else if(strArr[i].equals("-")) {
					val = Integer.parseInt(strArr[i+1]);
					cal.minus(val);
				}
				else if(strArr[i].equals("*")) {
					val = Integer.parseInt(strArr[i+1]);
					cal.mult(val);
				}
				else if(strArr[i].equals("/")){
					try {
						val = Integer.parseInt(strArr[i+1]);
						cal.div(val);
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println(e);
					}
				}
			}
		
		System.out.println(cal.getResult());
	}
}
