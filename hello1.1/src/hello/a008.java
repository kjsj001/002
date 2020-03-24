package hello;
public class a008{
	public static void main(String[]args) {
		int b=0;
		int a=1;
		char c ='a';
		do {
			System.out.print(c);
			b++; 
			c++;
			if(b >=13&&a<=1) {
				System.out.println();
				a++;
			}
		}while(b<26);
	}
}