package Study2017_11_04;

public class MethodTest_MethodCollection {
	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(10,7);
		println("������ : " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}

}
