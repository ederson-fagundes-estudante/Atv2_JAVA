import java.util.Scanner;
public class Exercicio1 {
	public static float inputFlo(String text) {
		System.out.print(text);
		Scanner sc = new Scanner(System.in);
		float value = sc.nextFloat();
		return value;
	}
	public static void main(String[] args) {
		double num = inputFlo("Valor:");

		double quad = Math.pow(num, 2);
		double cubo = Math.pow(num, 3);
		double r2 = Math.sqrt(num);
		double r3 = Math.cbrt(num);

		System.out.printf("Numero ao quadrado: %.3f ",quad);
		System.out.printf("\nNumero ao cubo: %.3f",cubo);
		System.out.printf("\nRaíz quadrada: %.3f",r2);
		System.out.printf("\nRaíz cubica: %.3f",r3);
	}

}
