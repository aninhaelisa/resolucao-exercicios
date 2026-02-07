import java.util.Scanner;
import java.util.Locale;

public class ex02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome1, nome2;
		int idade1, idade2;
		Double media;
		
		nome1 = sc.next();
		idade1 = sc.nextInt();
		nome2 = sc.next();
		idade2 = sc.nextInt();
		
		media =(double) (idade1 + idade2)/2;
		
		System.out.printf("A idade média entre %s e %s é de %.2f", nome1, nome2, media);
		
		sc.close();
	}

}
