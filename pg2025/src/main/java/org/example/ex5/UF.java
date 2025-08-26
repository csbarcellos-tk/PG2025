package ex5;

public enum UF{
    BAHIA("BAHIA", "BH"),
    SAO_PAULO("SAO_PAULO","SP"),
    RIO_DE_JANEIRO("RIO_DE_JANEIRO", "RJ");

    UF(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    private  String nome;
    private  String sigla;

    @Override
    public String toString() {
        return "UF{" +
                "nome='" + nome + '\'' +
                ", sigla='" + sigla + '\'' +
                '}';
    }
}
