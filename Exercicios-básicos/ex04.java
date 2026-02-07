import java.util.Scanner;
import java.util.Locale;

public class ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int tempo_gasto;
		double plano, preco_final;
		tempo_gasto = sc.nextInt();
		plano = 50.00;
		if(tempo_gasto > 100) {
			preco_final = plano + (tempo_gasto - 100) * 2;
			System.out.printf("O tempo ultrapassou o limite do plano.%nO preço final é de R$%.2f", preco_final);
		} else{
			preco_final = plano;
			System.out.printf("O valor esta dentro do limite do plano.%nO preço final é de %.2f", preco_final);
		}
		
		
		sc.close();

	}

}
