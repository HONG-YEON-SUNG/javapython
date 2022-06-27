package ex0627;

public class ex01 {
	public static void main(String[] args) {
		
		
		//변수 선언
		//변수의 사용 용도에 따라
		//int double String boolean
		//형변환
		
		int a = 10;
		double b= a;
		
		double c = 30.44;
		int d = (int)c;
		System.out.println("b = "+b);
		System.out.println("d = "+d);
		System.out.println("(3+4)*5 = "+(3+4)*5);
		System.out.println("3>4 = "+(3>4));
		
		
		//&& 그리고
		int num1 = 3;
		System.out.println("3>4 = "+(3>4 && (num1+=3)<3));
		System.out.println("num1 = " +num1);
		
		System.out.println("3>4 =  "+(3>4 || (num1+=3)<3));
		//(num1+=3)=num1+3
		
		
		//System.out.println(++num); = num의 값 하나 증가후 출력 답은 num+1
		//System.out.println(num++); = num의 값 출력후  값 증가 출력 답은 num
		System.out.println("num1 = "+num1);
	}
}
