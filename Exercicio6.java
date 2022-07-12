import java.util.Scanner;
public class Exercicio6 {
	public static float inputFlo(String text) {
		System.out.print(text);
		Scanner sc = new Scanner(System.in);
		float value = sc.nextFloat();
		return value;
	}
	public static boolean bigger(float a, float b) {
		if(a>b) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		
		float numbers[] = {inputFlo("Valor 1:"), inputFlo("Valor 2:"), inputFlo("Valor 3:"), inputFlo("Valor 3:"), inputFlo("Valor 3:"), inputFlo("Valor 3:"), inputFlo("Valor 3:"), inputFlo("Valor 3:"), inputFlo("Valor 3:")};
		float results[] = {0, 0, 0,0, 0, 0,0, 0, 0};
		for(int x = 0; x<numbers.length; x++) {
			int z = 0;
			float vx = numbers[x];
			for(int y = 0; y<numbers.length; y++) {
				float vy = numbers[y];
				if(vx>vy) {
					z++;					
				}
			}	
			results[z] = vx;
		}
		for(int x = 0; x<results.length; x++) {
			System.out.println(results[x]);
		}
	}
}