package hello;
 public class a004{
	 public static void main(String[]args) {
		 int a=67;
		 if(a<60) {
			 System.out.println("不及格");
			
		 }else {
			 if(a>=60 & a<80) {
				 System.out.println("中");
				 
			 }else {
				 if(a>=80 & a<90) {
					 System.out.println("良");
					 
				 }else {
					 System.out.println("优");
				 }
			 }
		 }
	 }
 }