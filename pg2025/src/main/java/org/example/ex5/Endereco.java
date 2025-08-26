package ex5;

public class Endereco {
    private String id;
    private  String numero;
    private String cep;
    private String cidade;

    private  UF uf;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public UF getUf() {
        return uf;
    }

    public void setUf(UF uf) {
        this.uf = uf;
    }

    public Endereco(String id, String numero, String cep, String cidade, UF uf) {
        this.id = id;
        this.numero = numero;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;

    }
    @Override
    public String toString() {
        return "Endereco{" +
                "id='" + id + '\'' +
                ", numero='" + numero + '\'' +
                ", cep='" + cep + '\'' +
                ", cidade='" + cidade + '\'' +
                ", uf=" + uf.getSigla() +
                ", uf=" + uf.getSigla() +

                '}';
    }
}
