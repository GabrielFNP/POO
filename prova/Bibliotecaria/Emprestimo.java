package poo2.prova.Bibliotecaria;

public class Emprestimo {
    private Usuario usuario;
    private String dataEmprestimo;
    private String dataDevolucao;
    private double valorMulta;
    private int qtdEmprestimos;
    private int qtdRenovacoes;
    private livro livro;

    public boolean Emprestimo(livro livro, boolean qtdemprestimo)  {
        if (livro.getDisponivel()) {
                this.livro.setDisponivel(false);
                this.usuario = usuario;
                this.dataEmprestimo = "09/05/2022";
                this.dataDevolucao = "";
                this.valorMulta = 0;
                this.qtdRenovacoes = 0;
            } else { System.out.printf("Não é possivel fazer um emprestimo");}
        return qtdemprestimo;
           
}
    
    
    public boolean renovar() {
        this.qtdEmprestimos++;
        this.dataDevolucao = "";
        System.out.println("Emprestimo renovado");
        return true;
       
    } 


    public boolean devolverEmprestimo() {
        this.dataDevolucao = "09/05/2022";
        this.livro.setDisponivel(true);
        
        System.out.println("Emprestimo realizado");
        this.calcularMulta();
        System.out.println("A multa é de:" + this.valorMulta);
        return true;
    }



    public void calcularMulta() {

        if (qtdRenovacoes > 3) {
            this.valorMulta = qtdRenovacoes - 3;
        } else {
            this.valorMulta = 0;
        }

    }

}
