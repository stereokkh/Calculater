package day01;

public class Calculator {
	
	private double result = 0;
	
	protected double getResult() {
		return result;
	}
	protected void setResult(double result) {
		this.result = result;
	}
	
	public double plus(double num){
		return result += num;
	}
	public double minus(double num) {
		return result -= num;
	}
	public double div(double num) {
		return result /= num;
	}
	public double mult(double num) {
		return result *= num;
	}
}
