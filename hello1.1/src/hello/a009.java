package hello;
public class a009{
	public static void main(String[]args) {
		int a,b;
		a = 1;b = 1;
		for(a=1;a<100;a++) {
			b = a+b;
			//System.out.print(b);
		}
		System.out.println(b);
	}
}