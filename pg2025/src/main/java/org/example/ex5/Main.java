package ex5;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(1,"Marta", 40, "454345", "caua@barce",Sexo.FEMININO,
                new Endereco("Rua a","32", "Bloco b", "3535353",UF.RIO_DE_JANEIRO));
        System.out.println(pessoa1.toString());

    }
}
