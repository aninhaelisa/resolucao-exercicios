import java.util.Scanner;
import java.util.Locale;

public class ex03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, media;
		System.out.println("Qual a primeira nota?");
		n1 = sc.nextInt();
		System.out.println("Qual a segunda nota?");
		n2 = sc.nextInt();
		media = (n1+n2)/2;

        if (media < 0 || media > 10) {
            System.out.println("Média inválida");
        }

        else if (media > 6) {
            System.out.println("Você passou, sua média é de " + media);
        } 
        else if (media == 6) {
            System.out.println("Você passou na risca, sua média é de " + media);
        } 
        else {
            System.out.println("Você reprovou, se esforce mais na próxima vez");
        }
		sc.close();
	}

}
