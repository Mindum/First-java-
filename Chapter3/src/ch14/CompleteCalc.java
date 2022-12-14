package ch14;

public class CompleteCalc extends Calculator {

	@Override
	public void description() {
		System.out.println("CompleteCalc overriding");
	}

	@Override
	public int times(int num1, int num2) {
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2==0)
			return ERROR;
		
		return num1/num2;
	}
	
	public void showInfo() {
		System.out.println("구현 완료");
	}

}
