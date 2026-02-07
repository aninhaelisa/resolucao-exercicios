import java.util.Scanner;
import java.util.Locale;

public class ex06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		double[] lista = new double[n1];
		double media, n2, maior;
		double soma = 0;
		maior = lista[0];
		for(int i = 0; i<lista.length; i++) {
		     n2 = sc.nextDouble();
		     if(maior<n2) {
		    	 maior = n2;
		     } 
		     soma += n2;
		}
		media = soma /n1;
		System.out.printf("Média = %.2f%n",media);
		System.out.printf("Maior valor = %.2f%n",maior);
		
		sc.close();

	}

}
