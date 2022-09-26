public class Contato {
    private String nome;
    private String endereco;
    private long cpf;

    public Contato(String nome, String endereco, long cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getContato(){

		String aux= nome + "\n" + endereco + "\n" + Long.toString(cpf) + "\n";
		
        return aux;
	}
}
