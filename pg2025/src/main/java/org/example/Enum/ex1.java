package Enum;

import java.time.Period;

public class ex1 {
    public static void main(String[] args) {

        public class Cliente{
            private  String nome;
            private Pedido;

            public Cliente(String nome, Pedido pedido){
                this.nome = nome;
                this.pedido = pedido;
            }
            public String getNome(){
                return nome;
            }
            public void setNome(String nome){
                this.nome = nome;
            }
            public Pedido getPedido(){
                return pedido;
            }
            public  void setPedido(Pedido pedido){
                this.pedido = pedido;
            }

            @Override
            public String toString() {
                return "Cliente{" +
                        "nome='" + nome + '\'' +
                        '}';
            }
        }

    }
}
