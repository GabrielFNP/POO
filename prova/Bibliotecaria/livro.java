package poo2.prova.Bibliotecaria;

public class livro {
    private String título, nomeautor,editora,edição;
    private int disponivel;

    public livro(String título, String nomeautor, String editora, String edição) {
        this.título = título;
        this.nomeautor = nomeautor;
        this.editora = editora;
        this.edição = edição;
    }

    public boolean getDisponivel() {
        if(disponivel > 1){}
        return true;
    }

    
    public String getTítulo() {
        return título;
    }

    public String getEdição() {
        return edição;
    }

    public void setEdição(String edição) {
        this.edição = edição;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getNomeautor() {
        return nomeautor;
    }

    public void setNomeautor(String nomeautor) {
        this.nomeautor = nomeautor;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public void setDisponivel(boolean b) {
    }  
}
