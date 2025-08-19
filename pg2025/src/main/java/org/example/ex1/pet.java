package org.example.ex1;

public class pet {

    public class Pet {
        private String nome;
        private  int idade;
        private String raça;
        private String porte;
        private String alimentacao;

        public pet(String nome, int idade, String raca, String porte, String alimentacao) {
            this.nome = nome;
            this.alimentacao = alimentacao;
            this.porte = porte;
            this.raca = raca;
            this.idade = idade;
        }
        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }

        public String getRaça() {
            return raca;
        }

        public String getPorte() {
            return porte;
        }

        public String getAlimentacao() {
            return alimentacao;
        }
        public void dados() {
            System.out.println("Nome: " +nome);
            System.out.println("Idade: "+ idade);
            System.out.println("Raça: " + raça);
            System.out.println("Porte: " + porte);
            System.out.println("Alimentacao: " + alimentacao);
            System.out.println("--------------------------");

        }
        @Override
        public String toString() {
            return "Pet{" +
                    "nome='" + nome + '\'' +
                    ", idade=" + idade +
                    ", raça='" + raça + '\'' +
                    ", porte='" + porte + '\'' +
                    ", alimentacao='" + alimentacao + '\'' +
                    '}';
        }
    }
    }



