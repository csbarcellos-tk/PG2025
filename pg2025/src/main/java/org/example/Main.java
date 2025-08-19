package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // instanciar uma classe.

        Cliente c1 = new Cliente("Marta", 25);

        // Atribuir valores.
        c1.setNome("Marta");
        c1.setIdade(25);

        //Mostrar valores

        System.out.println("Nome; " + c1.getNome());
        System.out.println("Idade; " + c1.getIdade());

        }
    }
