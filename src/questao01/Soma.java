package questao01;



public class Soma {
    public static void main(String[] args) {
        int INDICE = 13, SOMA = 0, K = 0;
        while(K < INDICE){ 
            K = K + 1;
            SOMA = SOMA + K;
        }
        //SAÍDA: 91
        System.out.println(SOMA);
    }
}