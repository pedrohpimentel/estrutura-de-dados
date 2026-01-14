package TAD;

import java.util.Scanner;

public class TadNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Numero numero = new Numero();

        while(true){
            System.out.println("===================================================");
            System.out.println("               Estudo do TAD Numero");
            System.out.println("===================================================");
            System.out.println("0 - Encerrar");
            System.out.println("1 - Ler valor");
            System.out.println("2 - Atribuir valor");

            System.out.print("Qual a sua opção? ");

            int opcao = sc.nextInt();
            if (opcao == 0){
                break;
            } else if (opcao == 1) {
                System.out.println("\n\n" + numero.getValor() + "\n\n");
            } else if (opcao == 2) {
                System.out.print("Forneça o novo valor: ");
                float v = sc.nextFloat();
                numero.setValor(v);
            }
        }
        System.out.println("---- FIM ----");
        System.out.println("Até a próxima.");
    }
}
