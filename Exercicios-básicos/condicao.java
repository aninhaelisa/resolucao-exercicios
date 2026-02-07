import java.util.Scanner;
import java.time.Year;

public class condicao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Qual ano você nasceu?");
		int ano = sc.nextInt();
		int anoAtual = Year.now().getValue();
		int idade = anoAtual - ano;
		if (idade > 18) {
		    System.out.println("Você é maior de idade.");
		} else {
		    if (idade == 18) {
		        System.out.println("Você tem 18 anos");
		    } else {
		        System.out.println("Você é menor de idade");
		    }
		}
		sc.close();
	}

}
