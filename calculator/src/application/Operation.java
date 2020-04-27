package application;
import java.lang.Math;

public class Operation {
	Operation Operation1;
	Operation Operation2;
	int op;
	double value;
	
	public Operation (Operation Operation1, Operation Operation2, int op, double value) {
		this.Operation1 = Operation1;
		this.Operation2 = Operation2;
		this.op = op;
		this.value = value;
	}
	
	public double solve() {
		if (op == -1) {
			return value;
		}
		
		if (op == 0) {
			return Operation1.solve() + Operation2.solve();
		}
		if (op == 1) {
			return Operation1.solve() - Operation2.solve();
		}
		if (op == 2) {
			return Operation1.solve() * Operation2.solve();
		}
		if (op == 3) {
			return Operation1.solve() / Operation2.solve();
		}
		if (op == 4) {
			return Math.log(Operation1.solve());
		}
		
		
		System.out.println("ERROR");
		return Double.MIN_VALUE;
	}
}
