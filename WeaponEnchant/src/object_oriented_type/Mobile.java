package object_oriented_type;

public class Mobile {
	String company = "�Ｚ";
	String model;
	String color;
	int type; // 4g, 5g
	
	// ��� �ʵ带 �Ű������� �ϴ� ������
	Mobile(String company, String model, String color, int type) {
		// ���޹��� �Ű������� ��� ���� ���� �ʵ忡 ����
		this.company = company; // �ʵ� = �Ű�����
		this.model = model;
		this.color = color;
		this.type = type;
	}
	
	// �⺻������ ����
	Mobile() {
		
	}
	// ������ overloading: �����ڸ� ���� �� ������ �� ����
	
	Mobile(String model, String color, int type) {
		this.model = model;
		this.color = color;
		this.type = type;
	}

}
