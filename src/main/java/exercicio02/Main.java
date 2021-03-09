package exercicio02;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Main app = new Main();
		app.start();

	}

	private void start() {
		// TODO Auto-generated method stub
		
		System.out.print("Digite o valor do produto: ");
		
		Scanner obterValorDoUsuario = new Scanner(System.in);
		
		double valor = obterValorDoUsuario.nextDouble();
		
		int valorCast = (int) valor;
		
		System.out.println("valor com casas decimais: " + valor + " | " + valorCast);
		
		
		
		
		
	}

}
