import java.util.Scanner;

public class aula_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		/*while(n<=10) {
			System.out.println(n);
			n++;
		}*/
		while(n!=10) {
			System.out.println("Adivinhe um numero: ");
			n = sc.nextInt();
		}
		System.out.println("Você acertou!");
		sc.close();
	}

}
