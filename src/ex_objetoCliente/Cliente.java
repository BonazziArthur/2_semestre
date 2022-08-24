package ex_objetoCliente;

public class Cliente {
    private String id; //xxx
    private String nome;
    private int idade;
    private String telefone;

    public Cliente(String id, String nome, int idade, String telefone){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    public String toString(){
        return "ID: " + id + "\nNome: " + nome + "\nIdade: " + idade +
                "\nTelefone: " + telefone;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
