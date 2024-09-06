package questao02;

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
