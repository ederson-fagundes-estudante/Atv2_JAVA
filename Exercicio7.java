import java.util.Scanner;
public class Exercicio7 {
	public static float inputFlo(String text) {
		System.out.print(text);
		Scanner sc = new Scanner(System.in);
		float value = sc.nextFloat();
		return value;
	}
	public static boolean �Par(float a) {
		if(a%2 < 1) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		
		float numbers[] = {inputFlo("Valor 1:")};
		
		for(int x = 0; x<numbers.length; x++) {
			if(�Par(numbers[x])) {
				System.out.println(numbers[x]+" � par");
			}else {
				System.out.println(numbers[x]+" � impar");
			}
		}

	}
}