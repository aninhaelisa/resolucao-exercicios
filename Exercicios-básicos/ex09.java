import java.util.Scanner;
import java.util.Arrays;
import java.util.Locale;

public class ex09 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];
		double  soma = 0.0;
		
		for(int i =0; i<n; i++) {
			nomes[i] = sc.next();
			idades[i] = sc.nextInt();
			alturas[i] = sc.nextDouble();
		}
		
		for(int i = 0; i<n; i++) {
		 	soma += alturas[i];
		}
		
		double media = soma/n;
		
		int cont = 0;
		for (int i = 0; i<n; i++) {
			if(idades[i]<16) {
				cont+=1;
			}
		}
		
		double x = (double) cont*100 /n;

		System.out.println("Dados informados: "+Arrays.toString(nomes)+Arrays.toString(idades)+Arrays.toString(alturas));
		System.out.printf("Altura média: %.2f%n", media);
		System.out.printf("Pessoas com menos de 16 anos: %.2f% %n",x);
		sc.close();

	}

}
