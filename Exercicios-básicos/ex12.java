import java.util.Scanner;
import java.util.Locale;
public class ex12 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[][] matriz = new double[n][n];
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				matriz[i][j] = sc.nextDouble();
			}
		}
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				System.out.print(matriz[i][j]+" | ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
