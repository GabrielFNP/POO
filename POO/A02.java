

import java.util.Scanner;

public class A02 {
    public static void main(String[] args) {

    
    int valor; 
    int nota50 = 50;
    int nota10 = 10;
    int nota5 = 5;
    int nota1 = 1; 
    
    try (Scanner sc = new Scanner(System.in)) {
        
        System.out.println("Insira o valor a ser sacado."+"\n");
        valor = sc.nextInt();
    }

   
    if(nota50 >= nota50) {
        nota50 = valor / 50; 
        valor = valor % 50;   
        if (nota50!= 0)
            System.out.println(nota50 + " Notas de R$ 50,00"+"\n");
    } 
    if(nota10 >= nota10) {
        nota10 = valor / 10;
        valor = valor % 10;
        if (nota10 != 0)
            System.out.println(nota10 + " Notas de R$ 10,00"+"\n");
    }
    
    if(nota5 >= nota5) {
        nota5 = valor / 5;
        valor = valor % 5;
        if (nota5 != 0)
            System.out.println(nota5 + " Notas de R$ 5,00"+"\n"); 
    }
    
    if(nota1 >= nota1) {
        nota1 = valor / 1;
        valor = valor % 1;
        if (nota1 != 0)
            System.out.println(nota1 + " Notas de R$ 1,00"+"\n");
     }
  }
}