import java.util.Scanner;

public class MatrizLocalizar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ler linhas e colunas
        System.out.print("Digite o numero de linhas: ");
        int linhas = sc.nextInt();

        System.out.print("Digite o numero de colunas: ");
        int colunas = sc.nextInt();

        int[][] matriz = new int[linhas][colunas];

        // Ler valores da matriz
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Número a ser localizado
        System.out.print("\nDigite o numero que deseja localizar: ");
        int numero = sc.nextInt();

        boolean encontrado = false;

        // Procurar o número
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {

                if (matriz[i][j] == numero) {
                    encontrado = true;

                    System.out.println("\nPosição encontrada: Linha " + i + ", Coluna " + j);

                    if (i > 0) {
                        System.out.println("Cima: " + matriz[i - 1][j]);
                    }
                    if (i < linhas - 1) {
                        System.out.println("Baixo: " + matriz[i + 1][j]);
                    }
                    if (j > 0) {
                        System.out.println("Esquerda: " + matriz[i][j - 1]);
                    }
                    if (j < colunas - 1) {
                        System.out.println("Direita: " + matriz[i][j + 1]);
                    }
                }
            }
        }

        if (!encontrado) {
            System.out.println("\nNúmero não encontrado na matriz.");
        }

        sc.close();
    }
}
