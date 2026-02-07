import java.util.Scanner;
import java.util.Arrays;
import java.util.Locale;

public class ex08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] valores = new double[n];
		double soma = 0;
		
		for(int i = 0; i<n; i++) {
			valores[i] = sc.nextDouble();
			soma += valores[i];
		}

		System.out.println("Valores digitados: "+Arrays.toString(valores));
		double media = soma/n;
		System.out.printf("Soma: %.2f%n", soma);
		System.out.printf("Média: %.2f%n", media);
		sc.close();

	}

}