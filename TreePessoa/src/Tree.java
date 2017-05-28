/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guilherme Freitas
 */
public class Tree {

    private Pessoa pessoa;
    private Tree dir;
    private Tree esq;

    public Tree(Pessoa valor) {
        this.pessoa = valor;
        this.esq = dir = null;
    }

    public Tree() {
        this.esq = dir = null;
    }

    //Inseri na arvore
    public Tree inserir(Tree aux, Pessoa valor) {
        if (aux == null) {
            aux = new Tree(valor);
        } else if (valor.getIdade() < aux.pessoa.getIdade()) {
            aux.esq = inserir(aux.esq, valor);
        } else {
            aux.dir = inserir(aux.dir, valor);
        }
        return aux;
    }
    
    //Imprime em Ordem
    public void imprimeOrdem(Tree aux) {
        if (aux == null) {
            return;
        }
        imprimeOrdem(aux.esq);
        System.out.println(aux.pessoa);
        imprimeOrdem(aux.dir);
    }
}
