import java.util.Scanner;
public class Exercicio2 {
	public static float inputFlo(String text) {
		System.out.print(text);
		Scanner sc = new Scanner(System.in);
		float value = sc.nextFloat();
		return value;
	}
	public static void main(String[] args) {
		double a = inputFlo("a:");
		double b = inputFlo("b:");
		double c = inputFlo("c:");

		double delta = Math.pow(b, 2)-4*a*c;
		
		double x1 = (-b+Math.sqrt(delta))/(2*a);
		double x2 = (-b-Math.sqrt(delta))/(2*a);
		
		System.out.println("x¹ = "+x1);
		System.out.println("x² = "+x2);
	}

}
