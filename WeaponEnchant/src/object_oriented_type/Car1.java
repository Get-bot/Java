package object_oriented_type;

public class Car1 {
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	//생성자선언
	Car1(int gas){
		this.gas = gas;
	}
		

	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}else{
			System.out.println("gas가 있습니다.");
			return true;
			}
		}
	void run(	) {
		boolean run = true;
			while(run) {
				if(gas>0) {
					System.out.println("달립니다.(gas 잔량 : "+gas+")");
					gas -=1;
				}else {
					System.out.println("멈춥니다.(gas 잔량 : "+gas+")");
					run = false;
				}	
			}
	}
	
}
