import java.util.Scanner;
import java.util.Locale;
import java.util.Arrays;
public class vetoresArray {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] valores = new double[n];
		for(int i = 0; i<valores.length; i++) {
			valores[i] = sc.nextDouble();
		}
		for(int i = 0; i<valores.length; i++) {
			System.out.println(valores[i]);
		}
		System.out.println("Tudo em uma linha:" + Arrays.toString(valores));
		
		sc.close();

	}

}
