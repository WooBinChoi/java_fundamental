package java_20210512;

public class StringDemo {
	public static String reverse(String str) {
		return "";
	}
	
	public static void m(int a, int[] b, String s) {
		a = 20;
		b[3]=40000;
		s += "123";
	}
	public static void main(String[] args) {
		String str = "beautiful"; // => "lufituaeb";
		System.out.println(str.substring(1,2));
		String str5 = reverse(str);

		int a = 10;
		int[] b = {1,2,3,4};
		String s = "abc";
		System.out.println(a+","+b[3]+","+s);
		//CallByReference에서 유일하게 안바뀌는 건 String
		m(a,b,s);
		System.out.println(a+","+b[3]+","+s);
		String str1 = new String("hello");
		String str2 = new String("hello");
		String str3 = "test";
		String str4 = "test";
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
	}
}
