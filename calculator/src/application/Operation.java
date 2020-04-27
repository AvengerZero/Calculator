package application;

public class Operation {
	Operation Operation1;
	Operation Operation2;
	int op;
	double value;
	boolean error;
	
	public Operation (Operation Operation1, Operation Operation2, int op, double value) {
		this.Operation1 = Operation1;
		this.Operation2 = Operation2;
		this.op = op;
		this.value = value;
	}
	
	public String solve() {
		try {
			if (op == -1) {
				return "" + (value);
			}
			
			if (op == 0) {
				return "" + (Double.parseDouble(Operation1.solve()) + Double.parseDouble(Operation2.solve()));
			}
			if (op == 1) {
				return "" + (Double.parseDouble(Operation1.solve()) - Double.parseDouble(Operation2.solve()));
			}
			if (op == 2) {
				return "" + (Double.parseDouble(Operation1.solve()) * Double.parseDouble(Operation2.solve()));
			}
			if (op == 3) {
				return "" + (Double.parseDouble(Operation1.solve()) / Double.parseDouble(Operation2.solve()));
			}
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("ERROR");
		}
		
		
		return "Error";
	}
}
