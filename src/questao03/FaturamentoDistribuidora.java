package questao03;

/*
 3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
• O menor valor de faturamento ocorrido em um dia do mês;
• O maior valor de faturamento ocorrido em um dia do mês;
• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

IMPORTANTE:
a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média;
 */

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class FaturamentoDistribuidora {

    public static void main(String[] args) {
        JSONParser jsonParser = new JSONParser();
        

        try {

            FileReader reader = new FileReader("E:\\Java Projects\\TargetSistemas-Estágio-SãoPaulo\\src\\questao03\\dados.json");
            Object obj = jsonParser.parse(reader);
            JSONArray faturamentoMensal = (JSONArray) obj;
            double menorFaturamento = Double.MAX_VALUE;
            double maiorFaturamento = Double.MIN_VALUE;
            double somaFaturamento = 0.0;
            int diasComFaturamento = 0;
            int diasAcimaDaMedia = 0;
            double mediaFaturamento = 0.0;
            double valor = 0.0;

            
            for (Object objeto : faturamentoMensal) {
                JSONObject diaFaturamento = (JSONObject) objeto;
                valor = (double) diaFaturamento.get("valor");

                if (valor > 0) {
                    if (valor < menorFaturamento) {
                        menorFaturamento = valor;
                    }
                    if (valor > maiorFaturamento) {
                        maiorFaturamento = valor;
                    }
                    somaFaturamento += valor;
                    diasComFaturamento++;
                }
            }

            
            mediaFaturamento = somaFaturamento / diasComFaturamento;

            for (Object o : faturamentoMensal) {
                JSONObject diaFaturamento = (JSONObject) o;
                valor = (double) diaFaturamento.get("valor");

                if (valor > mediaFaturamento) {
                    diasAcimaDaMedia++;
                }
            }

            // Exibe os resultados
            System.out.println("Menor valor de faturamento: " + menorFaturamento);
            System.out.println("Maior valor de faturamento: " + maiorFaturamento);
            System.out.println("Dias com faturamento acima da média("+mediaFaturamento+"): " + diasAcimaDaMedia + " dias");

        } catch (IOException | ParseException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}


