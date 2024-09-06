package questao05;

import java.util.Scanner;

public class StringInvertida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra;
        String inversa;


        System.out.print("Digite uma string: ");
        palavra = sc.nextLine();
        
        inversa = inverterString(palavra);
        
        System.out.println("String inversa: " + inversa);
        
        sc.close();
    }

    public static String inverterString(String str) {
        char[] letras = str.toCharArray();
        String aux_inversa = "";
        for (int i = letras.length - 1; i >= 0; i--) {
            aux_inversa += letras[i];
        }
        return aux_inversa;
    }
}
