import  java.util.Scanner ;

public  class  A01 {
    public  static  void  main ( String [] args ) {

         double gasolina;
         double álcool;
         double resultado  ;

         try (Scanner sc = new  Scanner ( System . in)) {
            System.out.println(" OLA VAMOS VERIFICAR QUAL COMBUSTIVEL E MAIS COMPENSATIVO "  +  " \n "); 
            System.out.println(" DIGITE O VALOR POR LITRO DA GASOLINA:"+"\n "); 
             gasolina = sc . nextDouble();
            
            System.out.println("\n");
            System.out.println(" DIGITE O VALOR POR LITRO Do alcool: "+"\n"); 
           
            álcool = sc . nextDouble();
        }
            resultado = álcool / gasolina;

        if (resultado <=  0.7 ) {
          System.out.println ( " O gasolina é o combustivel mais compensativel = "  + resultado);
        }

        else {
            System.out.println( " O alcool é o  combustivel mais compensativo = "  + resultado);

        }

    }
}
