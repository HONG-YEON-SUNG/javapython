package ex0627;

public class ex11 {
	public static void main(String[] args) {
		int n = 24;
		
		switch (n) {
		case (n>0 && n<10): 
			System.out.println("0이상 10미만의 수 ");
			break;
		
		case (n>10 && n<20):
			System.out.println("10이상 20미만의 수 ");
			break;
			
		case (n>20 && n<30):
			System.out.println("20이상 30미만의 수 ");
			break;
		case (n>30):
			System.out.println("음수 혹은 30이상의 수 ");
			break;
		defalut :
			System.out.println(" ");
		
		}
	}
}
