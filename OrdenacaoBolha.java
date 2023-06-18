import java.util.*;
public class OrdenacaoBolha implements Vetor {

    @Override
    public void vetorNumerosInt() {
        Scanner inserir = new Scanner(System.in);
        System.out.println("Quantos numeros dentro do vetor voce deseja adicionar?");
        int tamVetor = inserir.nextInt();
        int[] vetor = new int[tamVetor];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Qual numero voce deseja adicionar na " + (i + 1) + " posicao");
            vetor[i] = inserir.nextInt();
        }
        boolean houveTroca = true;
        System.out.println("Vetor sem ordenacao");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("posicao [" + i + "] = " + vetor[i]);

        }
        long inicio = System.currentTimeMillis();
        while (houveTroca) {
            houveTroca = false;

            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    houveTroca = true;
                }
            }
        }
        long fim = System.currentTimeMillis();
        long tempoExecucao = fim - inicio;

        
        
        System.out.println("Vetor ordenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("posicao [" + i + "] = " + vetor[i]);

        }
        System.out.println("Tempo de execucao: "+tempoExecucao);
    }
}
