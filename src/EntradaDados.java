import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String x = sc.next();
		int y = sc.nextInt();
		double z = sc.nextDouble();
		
		
		System.out.println("Qual é o seu nome? ");
		String nome = sc.next();
		System.out.println("O seu nome é: " + nome);
		
		
		sc.close();

	}

}
