package questao04;

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
