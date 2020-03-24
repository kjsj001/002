package hello;
 
public class a001{
	public static void main (String[]arge) {
		int a,b,c;
		a=57;b=16;
		c=a+b;
		System.out.println("c="+c);
		if(c%2==0) {
			c-=20;
		}else {
			c=c*c;
		}
		System.out.println("c="+c);
	}
}