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
        arvore = arvore.inserir(arvore, new Pessoa("Joao", 25, "222.222.222-22", "Rua 2"));
        arvore = arvore.inserir(arvore, new Pessoa("Maria", 41, "333.333.333-33", "Rua 3"));
        arvore = arvore.inserir(arvore, new Pessoa("Raimunda", 20, "444.444.444-44", "Rua 4"));
        arvore = arvore.inserir(arvore, new Pessoa("Joana", 9, "555.555.555-55", "Rua 5"));
        arvore = arvore.inserir(arvore, new Pessoa("Roberta", 74, "666.666.666-66", "Rua 6"));
        arvore = arvore.inserir(arvore, new Pessoa("Amanda", 33, "777.777.777-77", "Rua 7"));
        arvore = arvore.inserir(arvore, new Pessoa("Luiz", 35, "888.888.888-88", "Rua 8"));
        arvore = arvore.inserir(arvore, new Pessoa("Carlos", 45, "999.999.999-99", "Rua 9"));
        arvore = arvore.inserir(arvore, new Pessoa("Marcos", 12, "101.010.101-01", "Rua 10"));
        arvore = arvore.inserir(arvore, new Pessoa("Fernado", 34, "121.121.121-12", "Rua 11"));
        arvore = arvore.inserir(arvore, new Pessoa("Aurelio", 10, "343.343.343-34", "Rua 12"));
        arvore = arvore.inserir(arvore, new Pessoa("Magnolia", 27, "545.545.545-54", "Rua 13"));
        arvore = arvore.inserir(arvore, new Pessoa("Tiago", 30, "656.656.656-65", "Rua 14"));
        arvore = arvore.inserir(arvore, new Pessoa("Samuel", 36, "767.767.767-76", "Rua 15"));
        arvore = arvore.inserir(arvore, new Pessoa("Rafal", 78, "878.878.878-87", "Rua 16"));

        System.out.println("Em ordem");
        arvore.imprimeOrdem(arvore);

        System.out.println("\nPessoa a ser excluida: " + new Pessoa("Fernado", 34, "121.121.121-12", "Rua 11"));
        arvore.remover(arvore, new Pessoa("Fernado", 34, "121.121.121-12", "Ruua 11"));
        System.out.println("\nArvore atualizada em ordem!");
        arvore.imprimeOrdem(arvore);

        System.out.println("\nEm pré-ordem");
        arvore.imprimirPreOrder(arvore);

        System.out.println("\nEm pós-ordem");
        arvore.imprimirPosOrder(arvore);

        int somaIdades = arvore.somaIdades(arvore);
        System.out.println("\nSomatoria das idades: " + somaIdades);
        System.out.println("Menor idade: " + arvore.encontraMenorIdade(arvore));
        System.out.println("Maior idade é: " + arvore.encontraMaiorIdade(arvore));
        System.out.println("\nPessoa a ser buscada: " + new Pessoa("Carlos", 45, "999.999.999-99", "Rua 9"));
        boolean resultado = arvore.encontrarPessoa(arvore, new Pessoa("Carlos", 45, "999.999.999-99", "Rua 9"));

        if (resultado) {
            System.out.println(new Pessoa("Carlos", 45, "999.999.999-99", "Rua 9") + " - Pessoa encontrada");
        } else {
            System.out.println(new Pessoa("Carlos", 45, "999.999.999-99", "Rua 9") + " - Pessoa não encontrada");
        }

        System.out.println("\nPessoa a ser buscada: " + new Pessoa("Marcia", 12, "323.323.323-32", "Rua 12"));
        boolean resultado2 = arvore.encontrarPessoa(arvore, new Pessoa("Marcia", 12, "323.323.323-32", "Rua 12"));

        if (resultado2) {
            System.out.println(new Pessoa("Marcia", 12, "323.323.323-32", "Rua 12") + " - Pessoa encontrada");
        } else {
            System.out.println(new Pessoa("Marcia", 12, "323.323.323-32", "Rua 12") + " - Pessoa não encontrada");
        }

        int qtdNos = arvore.totalNos(arvore);
        System.out.println("\nA árvore contém " + qtdNos + " nós ");
        System.out.println("\nA media das idade: " + arvore.mediaIdade(arvore));

    }
}
