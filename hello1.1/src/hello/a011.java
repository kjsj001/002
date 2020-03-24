package hello;
public class a011{
	public static void main (String[]args) {
		int[] intArray;
		String[] strArray;
		intArray=new int[5];
		strArray=new String[10];
		float[] floatArray=new float[4];
		char[] ch= {'a','b','c','d'};
		int n;
		for(n=0;n<4;n++) {
			System.out.println(ch[n]);
		}
		System.out.println(ch.length);
	}
}