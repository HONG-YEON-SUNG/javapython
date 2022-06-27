package ex0627;

public class ex09 {
	public static void main(String[] args) {
		
		int num1 = 50;
		int num2 = 100;
		
		int result = (num1>num2)? num1:num2;
		int result1 = (num1>num2)? (num1-num2):(num2-num1);
	
		if (result = (num1>num2)? num1:num2)
			System.out.println("큰수 : "+result);
		else (result1 = (num1>num2)? (num1-num2):(num2-num1))
			System.out.println("절댓값 : "+result1);
		
	}
}
