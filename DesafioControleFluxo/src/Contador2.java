import java.util.Scanner;

public class Contador2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro: ");
		int parametroUm = scanner.nextInt();
		System.out.println("Digite o segundo parâmetro: ");
		int parametroDois = scanner.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch(Exception e) {
			System.out.println("O segundo parâmetro tem que ser maior que o primeiro");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		if (parametroDois < parametroUm){
			throw new ParametrosInvalidosException();
		}
		int contagem = parametroDois - parametroUm;
		
		//realizar o for para imprimir os números com base na variável contagem
		for (int i = 0; i <= contagem; i++){
			System.out.println("Contagem: " + i);
		}
	}
}

