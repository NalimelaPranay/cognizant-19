
public class Cube {
	private static int number =567;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		number();
		

	}

	private static int number() {
		// TODO Auto-generated method stub
		int a=number % 10;
		int result1 = a *a *a;
		int dividevalue1 = number/10;
		int b= dividevalue1 % 10;
		int result2 = b *b *b;
		int dividevalue2 = dividevalue1/10;
		int c= dividevalue2 % 10;
		int result3 = c *c *c;
		int result=result1 +result2 +result3;
		System.out.println(result);
		return 0;
	}
	

}
