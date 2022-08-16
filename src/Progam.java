import java.util.Locale;
import java.util.Scanner;

public class Progam {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de Pessoas que serão cadastradas: ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		Double[] altura = new Double[n];
		boolean[] trabalha = new boolean[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i+1) + "º pessoa");
			sc.nextLine();
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			System.out.print("Trabalha ?(s/n) ");
			char resp = sc.next().charAt(0);
			if (resp == 's') {
				trabalha[i] = true;
			} else {
				trabalha[i] = false;
			}
		}
		
		System.out.println("DADOS DAS PESSOAS QUE TRABALHAM");
		for(int i = 0; i < n; i++) {
			if (trabalha[i]) {
				System.out.println();
				System.out.println("Nome: " + nome[i]);
				System.out.println("Idade: " + idade[i]);
				System.out.println("Altura: " + altura[i]);
			}
		}
		
	}

}
