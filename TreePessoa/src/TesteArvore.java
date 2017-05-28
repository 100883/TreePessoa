/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guilherme Freitas
 */
public class TesteArvore {

    public static void main(String[] args) {
        Tree arvore = new Tree(new Pessoa("Jose", 23, "111.111.111-11", "Rua 1"));
        arvore = arvore.inserir(arvore, new Pessoa("Joao", 23, "222.222.222-22", "Rua 2"));
        arvore = arvore.inserir(arvore, new Pessoa("Maria", 41, "333.333.333-33", "Rua 3"));
        arvore = arvore.inserir(arvore, new Pessoa("Raimunda", 20, "444.444.444-44", "Rua 4"));
        arvore = arvore.inserir(arvore, new Pessoa("Joana", 9, "555.555.555-55", "Rua 5"));
        arvore = arvore.inserir(arvore, new Pessoa("Roberta", 74, "666.666.666-66", "Rua 6"));
        arvore = arvore.inserir(arvore, new Pessoa("Amanda", 33, "777.777.777-77", "Rua 7"));
        arvore = arvore.inserir(arvore, new Pessoa("Luiz", 35, "888.888.888-88", "Rua 8"));
        arvore = arvore.inserir(arvore, new Pessoa("Carlos", 45, "999.999.999-99", "Rua 9"));
        arvore = arvore.inserir(arvore, new Pessoa("Marcos", 12, "101.010.101-01", "Rua 10"));
        System.out.println("Em ordem");
        arvore.imprimeOrdem(arvore);

    }
}
