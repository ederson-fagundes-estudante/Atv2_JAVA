import java.util.Scanner;
public class Exercicio5 {
	public static float inputFlo(String text) {
		System.out.print(text);
		Scanner sc = new Scanner(System.in);
		float value = sc.nextFloat();
		return value;
	}
	public static void main(String[] args) {
		double v1 = inputFlo("Valor 1:");
		double v2 = inputFlo("Valor 2: ");
		double maior;
		
		if(v1>v2) {
			maior = v1;
		} else {
			maior = v2;
		}
		
		System.out.println(maior);
	}
}