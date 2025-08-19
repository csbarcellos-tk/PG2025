package org.example.ex2;

public class Cliente {

    private String Nome;
    private int Idade;
    private int CPF;
    private String Endereco;
    private int Telefone;

    public Cliente(String nome, int idade, int CPF, String endereco, int telefone) {
        Nome = nome;
        Idade = idade;
        this.CPF = CPF;
        Endereco = endereco;
        Telefone = telefone;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int telefone) {
        Telefone = telefone;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "Nome='" + Nome + '\'' +
                ", Idade=" + Idade +
                ", CPF=" + CPF +
                ", Endereco='" + Endereco + '\'' +
                ", Telefone=" + Telefone +
                '}';
    }
}

