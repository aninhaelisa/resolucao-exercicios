import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int a = sc.nextInt();
		int b = sc.nextInt();
		double[][] matriz = new double[a][b];
		
		/* for-each
		 * for(double[] linha: matriz) {
			for(double valor: linha) {
				System.out.print(valor +" ");
			}
			System.out.println();
		}*/
		
		//for-for
		for (int i = 0; i<matriz.length; i++) {
			for (int j = 0; j<matriz[i].length; j++) {
				matriz[i][j] = sc.nextDouble();
			}
		}
		
		for (int i = 0; i<matriz.length; i++) {
			for (int j = 0; j<matriz[i].length; j++) {
				
				System.out.print(matriz[i][j]+" | ");
			}
			System.out.println();
		}
		sc.close();

	}

}
