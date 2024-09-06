package questao02;

/*2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado
pertence ou não a sequência.

IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código; 
*/

import java.util.Scanner;

public class VerificaFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("número para verificacao: ");
        n = sc.nextInt();

        if (verificarFibonacci(n)) {
            System.out.println("O número " + n + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + n + " não pertence à sequência de Fibonacci.");
        }

        sc.close();
    }

    public static boolean verificarFibonacci(int n) {

        int n1 = 0, n2 = 1, prox;

        if (n == 0 || n == 1) {
            return true;
        }
        while (n2 < n) {
            prox = n1 + n2;
            n1 = n2;
            n2 = prox;
        }
        return n2 == n;
    }
}
