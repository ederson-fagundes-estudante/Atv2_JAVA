import java.util.Scanner;
public class Exercicio4 {
	public static float inputFlo(String text) {
		System.out.print(text);
		Scanner sc = new Scanner(System.in);
		float value = sc.nextFloat();
		return value;
	}
	public static String verifyGrade(double grade) {
		if(grade>7) {
			return "Aprovado";
		}
		if(grade>3) {
			return "Exame";
		}
		return "Reprovado";
	}
	public static void main(String[] args) {
		double nota1 = inputFlo("Nota 1:");
		double nota2 = inputFlo("Nota 2: ");
		double nota3 = inputFlo("Nota 3:");
		
		double nota = (nota1+nota2+nota3)/3;

		System.out.println("Nota: "+nota);
		System.out.println(verifyGrade(nota));

		
	}

}
