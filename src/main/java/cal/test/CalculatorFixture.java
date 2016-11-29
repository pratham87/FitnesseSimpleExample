package cal.test;

public class CalculatorFixture {

	private double operand1;
	private double operand2;
	private String operator;
	Calculator cal;

	public void setOperand1(double operand1) {
		this.operand1 = operand1;
	}

	public void setOperand2(double operand2) {
		this.operand2 = operand2;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public double calculate() {
		cal = new Calculator(operand1, operator, operand2);
		return cal.calculate();
	}

}
