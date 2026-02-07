import java.util.Scanner;

public class aula_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int soma = 0;
		if(n<=0) {
			System.out.println("impossivel somar.");
		} else {
			for (int cont = 0; cont<n; cont++) {
				int valor = sc.nextInt();
				soma += valor;
			}
			System.out.println("A soma é "+soma);
		}


		
		sc.close();

	}

}
