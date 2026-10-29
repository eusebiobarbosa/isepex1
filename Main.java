import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int soma = 0;
        while (numero > 0) {
            int digito = numero % 10;
            if (digito % 2 == 0) {
                soma += digito;
            }
            numero /= 10;
        }
        System.out.println("A soma dos algarismos pares é: " + soma);

    }
}