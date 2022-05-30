 package poo2.prova.Bibliotecaria;

class Usuario {
    private String nome;
    private String email;
    private String cpf;
    




    public void usuario(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        
    }



    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}