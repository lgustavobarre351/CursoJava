package com.github.lgustavobarre351.CursoJava;

// Classe que representa uma Pessoa
public class Pessoa {
    // Atributos da classe Pessoa
    public String nome;
    public String email;
    public int cpf;

    // Método para exibir os dados da pessoa
    public String exibirDados() {
        return "=== Dados da Pessoa ===" + "\n" +
                "Nome: " + this.nome + "\n" +
                "Email: " + this.email + "\n" +
                "CPF: " + this.cpf;
    }

    // Método principal que executa o programa
    public static void main(String[] args) {
        // Criação de um objeto Pessoa
        Pessoa andre = new Pessoa();
        // Definição dos atributos do objeto
        andre.nome = "André Silva";
        andre.email = "andre@email.com";
        andre.cpf = 1111111;
        // Exibição dos dados da pessoa
        System.out.println(andre.exibirDados());
    }
}