package ksj.sec03.exam;

public class e02KoreanExample {
	public static void main(String[] args) {
		e02Korean k1 = new e02Korean("김ㅇㅇ", "031007-1234567");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		e02Korean k2 = new e02Korean("우ㅇㅇ", "940622-0654321");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
	}
}

