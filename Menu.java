/*
Alunos: João Marcos Contini Tavares Pereira RA:00236189
        Gustavo Henrique da Silva Nethson   RA:00173525
*/


import javax.swing.JOptionPane;
public class Menu {

    
    public static void main(String[] args) {
        Vetor vetorSelecao = new OrdenacaoSelecao();
        Vetor vetorBolha = new OrdenacaoBolha();
        Vetor vetorInsercao = new OrdenacaoInsercao();
        
        int opcao = -1;
        int vetor[];
        while(opcao != 0 ){
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Ordenação por inserção\n" +
                    "2 - Ordenação por seleção \n" +
                    "3 - Ordenação por bolha(BubbleSort) \n" +
                    "0 - Sair"));
                             
            switch (opcao) {
                case 1:
                vetorInsercao.vetorNumerosInt();
                    break;
                case 2:
                vetorSelecao.vetorNumerosInt();
                    break;    
                case 3:
                vetorBolha.vetorNumerosInt();                
                    break;
                default:
                    break;
            }
                
            
            
        }

    }
}