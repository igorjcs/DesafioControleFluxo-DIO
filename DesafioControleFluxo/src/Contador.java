import java.util.*;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = scanner.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);

        } catch (ParameterInvalidException){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        public static void contar (int parametroUm, int parametroDois) throw ParameterInvalidException {

            if (parametroUm >= parametroDois){
                int contagem = parametroDois - parametroUm;

                for (int cont = 0; cont <= contagem; cont++){
                    System.out.println("cont");
                }
            }
            
        }

    }
}
