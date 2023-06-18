import java.util.*;
public class OrdenacaoInsercao implements Vetor{

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
        int valor, j;
        System.out.println("Vetor sem ordenacao");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("posicao [" + i + "] = " + vetor[i]);

        }
        long inicio = System.currentTimeMillis();
        for(int i = 1; i < vetor.length; i++){
            valor = vetor[i];
            
            for(j = i - 1;  (j >= 0 && vetor[j] > valor) ; j-- ){
                
                vetor[j+1] = vetor[j];
                
            }
            vetor[j+1] = valor;
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
