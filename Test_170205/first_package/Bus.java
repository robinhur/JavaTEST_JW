package first_package;

public class Bus extends Car{

	void passenger() {
		System.out.println("����� �����ϴ�");
	}
	void accel() {
		System.out.println("���� �����ϴ�");
		super.accel();
	}
	
}
