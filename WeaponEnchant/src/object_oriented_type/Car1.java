package object_oriented_type;

public class Car1 {
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	//�����ڼ���
	Car1(int gas){
		this.gas = gas;
	}
		

	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
		}else{
			System.out.println("gas�� �ֽ��ϴ�.");
			return true;
			}
		}
	void run(	) {
		boolean run = true;
			while(run) {
				if(gas>0) {
					System.out.println("�޸��ϴ�.(gas �ܷ� : "+gas+")");
					gas -=1;
				}else {
					System.out.println("����ϴ�.(gas �ܷ� : "+gas+")");
					run = false;
				}	
			}
	}
	
}
