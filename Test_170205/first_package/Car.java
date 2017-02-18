package first_package;

public class Car {

	String company;
	String name;
	long price;
	
	void start() {
		System.out.println("시동이 걸렸습니다");
	}
	void end() {
		System.out.println("시동이 꺼졌습니다");
	}
	
	void accel() {
		System.out.println("자가 나갑니다");
	}
	void stop() {
		System.out.println("차가 멈춥니다");
	}
	
	String callName() {
		return name;
	}
	
	//생성자
	Car() {
		System.out.println("차가 생성되었습니다");
	}
	Car(String company, String name, long price) {
		System.out.println("두번 째 생성자로 차가 생성되었습니다");
		
		this.company = company;
		this.name = name;
		this.price = price;
	}
	
}
