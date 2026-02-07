import java.util.Scanner;
import java.util.Locale;

public class ex07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] valores = new double[n];
		for(int i = 0; i<n; i++) {
			valores[i] = sc.nextDouble();
		}
		for(int i = 0; i<n; i++) {
			if(valores[i]<0) {
				System.out.println(valores[i]);
			}
		}
		
		sc.close();

	}

}
