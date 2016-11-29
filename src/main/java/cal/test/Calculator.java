package cal.test;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
	private double operand1;
	private double operand2;
	private String operator;

	public Calculator(double operand1, String operator, double operand2) {
		this.operand1 = operand1;
		this.operator = operator;
		this.operand2 = operand2;
	}

	public Double calculate() {
		Map<String, Double> map = new HashMap<>();
		map.put("+", operand1 + operand2);
		map.put("-", operand1 - operand2);
		map.put("*", operand1 * operand2);
		map.put("/", operand1 / operand2);

		if (map.containsKey(operator)) {
			return map.get(operator);
		}
		return null;

	}

}
