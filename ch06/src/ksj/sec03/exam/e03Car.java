package ksj.sec03.exam;

public class e03Car {
	//필드 
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자 
	e03Car() {    //생성자1 
	}
	
	e03Car(String model) {     //생성자2
		this.model = model;
	}
	
	e03Car(String model, String color) {   //생성자3
		this.model = model;
		this.color = color;
	}
	
	e03Car(String model, String color, int maxSpeed) {  //생성자4
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}


