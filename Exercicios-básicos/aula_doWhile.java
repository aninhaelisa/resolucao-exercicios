import java.util.Scanner;
import java.util.Locale;
public class aula_doWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String x;
		
		
		do {
			System.out.println("Digite a temperatura em Celsius: ");
			double n = sc.nextDouble();
			double converter = (n*9/5)+32;
			System.out.println("Equivalente em Fahrenheit: "+converter);
			System.out.println("Deseja repetir? (s/n)");
			x = sc.next();
		} while(x.equalsIgnoreCase("s"));
		
		sc.close();
	}

}
