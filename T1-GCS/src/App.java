import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("====== Calculadora ======= ");

        System.out.println("Digite o primeiro valor: ");
        double valor1 = sc.nextDouble();

        System.out.println("Digite a operação (+, -, *, /): ");
        char operacao = sc.next().charAt(0);

        System.out.println("Digite o segundo valor: ");
        double valor2 = sc.nextDouble();

        double resultado = 0;

        boolean operacaoValida = true;

        switch (operacao) {
            case '+':
                resultado = valor1 + valor2;
                break;
            case '-':
                resultado = valor1 - valor2;
                break;
            case '*':
                resultado = valor1 * valor2;
                break;
            case '/':
                if (valor2 != 0) {
                    resultado = valor1 / valor2;
                } else {
                    System.out.println("Erro: divisão por zero não é permitida!");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Operação inválida!");
                operacaoValida = false;
        }

        if (operacaoValida) {
            System.out.println("Resultado: " + resultado);
        }


        sc.close();
    
//teste 

    }
}
