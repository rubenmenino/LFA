import java.util.*;
import java.io.*;

public class ex1_1 {
	
	public static void main (String[] args) {
		double n1,n2;
		String operacao;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o primeiro numero: ");
		n1 = sc.nextDouble();
		
		System.out.println("Insira o segundo numero: ");
		n2 = sc.nextDouble();
		
		Scanner op  = new Scanner(System.in);
		System.out.println("Escolhe a operação");
		operacao = op.next();
		
		switch (operacao)
		{
			case "+":
				System.out.println("Resultado é: " + (n1 + n2));
				break;
			
			case "-":
				System.out.println("Resultado é: " + (n1 - n2));
				break;
			
			case "*":
				System.out.println("Resultado é: " + (n1 * n2));
				break;
			
			case "/":
				System.out.println("Resultado é: " + (n1 / n2));
				break;		
		}
		
		
	}
}

