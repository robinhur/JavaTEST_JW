package first_package;

public class Car {

	String company;
	String name;
	long price;
	
	void start() {
		System.out.println("�õ��� �ɷȽ��ϴ�");
	}
	void end() {
		System.out.println("�õ��� �������ϴ�");
	}
	
	void accel() {
		System.out.println("�ڰ� �����ϴ�");
	}
	void stop() {
		System.out.println("���� ����ϴ�");
	}
	
	String callName() {
		return name;
	}
	
	//������
	Car() {
		System.out.println("���� �����Ǿ����ϴ�");
	}
	Car(String company, String name, long price) {
		System.out.println("�ι� ° �����ڷ� ���� �����Ǿ����ϴ�");
		
		this.company = company;
		this.name = name;
		this.price = price;
	}
	
}
