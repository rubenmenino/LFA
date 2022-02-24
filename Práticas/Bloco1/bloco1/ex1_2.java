import java.util.Scanner;
import java.util.Stack;

public class ex1_2 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Stack<Double> operando = new Stack<>();

		// ler numero
		String nextElem = "";
		while (sc.hasNext()) {
			// numero/operacao
			nextElem = sc.next();

			if (nextElem.matches("\\d")) {
				operando.push(Double.parseDouble(nextElem));
			}
			else {
				if (operando.size() < 2)  {
					System.err.println("ERROR: Two operands missing!");
					System.exit(1);
				}

				double n2 = operando.pop();
				double n1 = operando.pop();

				double resultado   = 0;

				switch(nextElem) {
					case "+":
						resultado = n1 + n2;
						break;
					case "-":
						resultado = n1 - n2;
						break;
					case "*":
						resultado = n1 * n2;
						break;
					case "/":
						if (n2 == 0) {
							System.err.println("ERROR: Divide by zero!");
							System.exit(2);
						}
						resultado = n1 / n2; 
						break;
					default:
						System.err.println("ERROR: invalid operator!");
						System.exit(3);
						break;
				}

				operando.push(resultado);

			}
			System.out.println("Stack: " + operando);
		}
		System.exit(1);
	}

}


