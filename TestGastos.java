package ProjetoControleDeGastos;

import java.util.Scanner;

public class TestGastos {
    public static void main(String[] args) {
        Gastos gastos = new Gastos();
        Scanner s = new Scanner(System.in);
        
        while(true){
            System.out.println("------ Controle de Gastos ------");
            System.out.println("1 - Adicionar gastos");
            System.out.println("2 - Remover gastos");
            System.out.println("3 - Listar gastos");
            System.out.println("4 - Atualizar gastos");
            System.out.println("0 - Sair");
            System.out.printf("Digite qual opção deseja: ");

            int entrada = s.nextInt();
            
            if (entrada == 0){
                break;
            } else if (entrada == 1) {
                gastos.adicionarGastos();
            }
        }
    }
}
