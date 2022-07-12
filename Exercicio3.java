import java.util.Scanner;
public class Exercicio3 {
	public static float inputFlo(String text) {
		System.out.print(text);
		Scanner sc = new Scanner(System.in);
		float value = sc.nextFloat();
		return value;
	}
	public static char verifyGrade(double grade) {
		if(grade>8) {
			return 'A';
		}
		if(grade>7) {
			return 'B';
		}
		if(grade>6) {
			return 'C';
		}
		if(grade>5) {
			return 'D';
		}
		return 'E';
	}
	public static void main(String[] args) {
		double nota1 = inputFlo("Trabalho de laboratório:");
		double nota2 = inputFlo("Avaliação semestral: ");
		double nota3 = inputFlo("Exame final:");

		double peso1 = (nota1)*(0.2);
		double peso2 = (nota2)*(0.3);
		double peso3 = (nota3)*(0.5);
		
		double nota = peso1+peso2+peso3;

		System.out.println("Nota: "+nota);
		System.out.println("Conceito: "+verifyGrade(nota));

		
	}

}
