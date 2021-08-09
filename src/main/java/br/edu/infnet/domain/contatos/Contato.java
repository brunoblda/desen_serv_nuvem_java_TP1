package br.edu.infnet.domain.contatos;

public class Contato {
    
    private int id;
    private String nome;
    private String apelido;
    private String email;
    private String fone;
    

    public Contato(int id, String nome, String apelido, String email, String fone) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.email = email;
        this.fone = fone;
        
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
     public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
      
}
