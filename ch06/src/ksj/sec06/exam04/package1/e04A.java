package ksj.sec06.exam04.package1;

public class e04A {
	//필드 
	e04A a1 = new e04A(true);    //(o)
	e04A a2 = new e04A(1);       //(o)
	e04A a3 = new e04A("문자열");  //(o)

	//생성자 
	public e04A(boolean b) {}     //public 접근 제한
	e04A(int b) {}                //default 접근 제한 
	private e04A(String s) {}     //private 접근 제한 
}

