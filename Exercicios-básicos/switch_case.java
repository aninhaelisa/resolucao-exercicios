import java.util.Scanner;
import java.time.Year;
public class switch_case {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int anoAtual = Year.now().getValue();
		int n = sc.nextInt();
		String s;
		switch(n) {
		case 1:
			s = "Domingo";
			System.out.println(s+" do ano "+anoAtual);
			break;
		case 2:
			s = "Segunda - feira";
			System.out.println(s+" do ano "+anoAtual);
			break;
		case 3:
			s = "Terça - Feira";
			System.out.println(s+" do ano "+anoAtual);
			break;
		case 4: 
			s = "Quarta - feira";
			System.out.println(s+" do ano "+anoAtual);
			break;
		case 5:
			s = "Quinta - feira";
			System.out.println(s+" do ano "+anoAtual);
			break;
		case 6: 
			s = "Sexta - feira";
			System.out.println(s+" do ano "+anoAtual);
			break;
		case 7: 
			s = "Sabado";
			System.out.println(s+" do ano "+anoAtual);
			break;
		default:
			s = "Valor inválido";
			System.out.println(s);
			break;
		} 
		
		sc.close();

	}

}
