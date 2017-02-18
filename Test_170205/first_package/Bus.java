package first_package;

public class Bus extends Car{

	void passenger() {
		System.out.println("사람이 탔습니다");
	}
	void accel() {
		System.out.println("문이 열립니다");
		super.accel();
	}
	
}
