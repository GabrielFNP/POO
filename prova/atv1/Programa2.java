package poo2.prova.atv1;

import java.util.Scanner;

public class Programa2 {
    public static void main(String[] args) {

        int vetor[] = new int[10];
        Scanner sc = new Scanner(System.in);
            for (int i = 0; i < vetor.length; i++) {
                System.out.println("Digite um numero\n");
                vetor[i] = sc.nextInt();
            }
        
        int menor = vetor[0];
        int maior = vetor[0];
        int soma = 0;
        int medc = 0;
        for (int i = 0; i < vetor.length; i++) {
            medc = (i +1);}
        
            
        for (int i = 0; i < vetor.length; i++) {
            medc = (i +1);
            
            

            if (vetor[i] < menor) {
                menor = vetor[i];
            }

            if (vetor[i] > maior) {
                maior = vetor[i];
            }

        }

        float media;
        
        System.out.println("O MENOR NÚMERO DO VETOR É: |" + menor+"|"+"\n");
        System.out.println("O MAIOR NUMERO DO VETOR É: |" + maior+"|"+"\n");
        System.out.println("------------------------------------------");
        
        System.out.println("A LISTA DE VETORES SÃO:"+"\n");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("|"+ vetor[i]+"|");
            soma=  (soma+ vetor[i]);
        }
        System.out.println("\n");
        System.out.println("------------------------------------------");
        media = (medc / vetor.length);
        System.out.println("\n");
        System.out.println("A SOMA   DOS VETORES RESULTA EM : |" + soma+"|"+"\n");
        System.out.println("A MEDIA  DOS VETORES RESULTA EM : |" + media+"|"+"\n");
        System.out.println("teste : |" + medc+"|"+"\n");
    }
}
