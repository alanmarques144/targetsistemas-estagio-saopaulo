package questao04;

/*
 4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
• SP – R$67.836,43
• RJ – R$36.678,66
• MG – R$29.229,88
• ES – R$27.165,48
• Outros – R$19.849,53

Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora. 
 */

import java.util.HashMap;
import java.util.Map;

public class FaturamentoEstado {
    public static void main(String[] args) {
 
        double total;
        String estado;
        double valor, percentual;

        Map<String, Double> faturamento = new HashMap<>();
        faturamento.put("SP", 67836.43);
        faturamento.put("RJ", 36678.66);
        faturamento.put("MG", 29229.88);
        faturamento.put("ES", 27165.48);
        faturamento.put("Outros", 19849.53);
        total = calcularTotal(faturamento);

       
        System.out.println("Percentual de representação por estado:");
        for (Map.Entry<String, Double> faturamentos : faturamento.entrySet()) {
            estado = faturamentos.getKey();
            valor = faturamentos.getValue();
            percentual = (valor / total) * 100;
             
            System.out.printf("%s: %.2f%%\n", estado, percentual);
        }
    }

    
    public static double calcularTotal(Map<String, Double> faturamento) {
        double total = 0.0;
        for (double valor : faturamento.values()) {
            total += valor;
        }
        return total;
    }
}
