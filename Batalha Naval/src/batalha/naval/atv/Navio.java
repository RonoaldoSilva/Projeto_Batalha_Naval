package batalha.naval.atv;

public  class Navio {
    private String nome;
    private int tamanho;
    private int acertos;

    public Navio(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.acertos = 0;
    }

    public boolean afundado(){
        return this.acertos == this.tamanho;
    }
    public void acertos(){
        this.acertos++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getAcertos() {
        return acertos;
    }

    public void setAcertos(int acertos) {
        this.acertos = acertos;
    }
}
