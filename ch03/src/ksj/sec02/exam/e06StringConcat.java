package ksj.sec02.exam;

public class e06StringConcat {
	public static void main(String[] args) {
		String str1 = "JDK" + 6.0;
		String str2 = str1 + " Ư¡";
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;
		String str4 = 3 + 3.0 + "JDK";
		System.out.println(str3);
		System.out.println(str4);		
	}
}