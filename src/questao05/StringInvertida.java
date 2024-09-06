package questao05;

/*
 5) Escreva um programa que inverta os caracteres de um string.

IMPORTANTE:
a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
b) Evite usar funções prontas, como, por exemplo, reverse;
 */

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
