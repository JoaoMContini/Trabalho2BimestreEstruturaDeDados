
import java.util.*;

public class OrdenacaoSelecao implements Vetor {

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
        System.out.println("Vetor sem ordenacao");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("posicao [" + i + "] = " + vetor[i]);

        }
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < vetor.length - 1; i++) {
            int pMenor = i;

            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[pMenor]) {
                    pMenor = j;
                }
            }

            if (pMenor != i) {
                int aux = vetor[i];
                vetor[i] = vetor[pMenor];
                vetor[pMenor] = aux;
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
