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

    //exclui um nó da árvore
    public Tree remover(Tree arvore, Pessoa valor) {
        if (arvore == null) {
            return null;
        } else if (arvore.pessoa.getIdade() > valor.getIdade()) {
            arvore.esq = remover(arvore.esq, valor);
        } else if (arvore.pessoa.getIdade() < valor.getIdade()) {
            arvore.dir = remover(arvore.dir, valor);
        } else //achou o nó  remover o nó sem filhos
         if (arvore.esq == null && arvore.dir == null) {
                arvore = null;
            } //nó so tem filho à direita
            else if (arvore.esq == null) {
                Tree aux = arvore;
                arvore = arvore.dir;
                aux = null;
            } //so tem filho a esquerda
            else if (arvore.dir == null) {
                Tree aux = arvore;
                arvore = arvore.esq;
                aux = null;
            } //no tem os dois filhos
            else {
                Tree aux = arvore.esq;

                while (aux.dir != null) {
                    aux = aux.dir;
                }

                arvore.pessoa = aux.pessoa;
                aux.pessoa = valor;
                arvore.esq = remover(arvore.esq, valor);
            }
        return arvore;
    }

    //imprime a árvore em pre ordem
    public void imprimirPreOrder(Tree raiz) {
        if (raiz == null) {
            return;
        }
        System.out.println(raiz.pessoa + " ");
        imprimirPreOrder(raiz.esq);
        imprimirPreOrder(raiz.dir);
    }

    //imprime a árvore em pros ordem
    public void imprimirPosOrder(Tree raiz) {
        if (raiz == null) {
            return;
        }
        imprimirPosOrder(raiz.esq);
        imprimirPosOrder(raiz.dir);
        System.out.println(raiz.pessoa + " ");
    }

    //verifica se a pessoa existe árvore 
    public boolean encontrarPessoa(Tree raiz, Pessoa valor) {
        if (raiz == null) {
            return false;
        } else if (raiz.pessoa.getNome().equalsIgnoreCase(valor.getNome())) {
            return true;
        } else if (valor.getIdade() > raiz.pessoa.getIdade()) {
            return encontrarPessoa(raiz.dir, valor);
        } else {
            return encontrarPessoa(raiz.esq, valor);
        }
    }

    //retorna a maior idade da árvore 
    public Pessoa encontraMaiorIdade(Tree raiz) {
        if (raiz != null) {
            while (raiz.dir != null) {
                raiz = raiz.dir;
            }
            return raiz.pessoa;
        }
        return null;
    }

    //retorna a menor idade da árvore
    public Pessoa encontraMenorIdade(Tree raiz) {
        if (raiz != null) {
            while (raiz.esq != null) {
                raiz = raiz.esq;
            }
            return raiz.pessoa;
        }
        return null;
    }

    //soma as idades das pessoas da árvore precorrendo a árvore em pre ordem
    public int somaIdades(Tree raiz) {

        if (raiz == null) {
            return 0;
        } else {
            return raiz.pessoa.getIdade() + somaIdades(raiz.esq) + somaIdades(raiz.dir);
        }
    }

    //conta o numero de nos da árvore precorrendo a árvore em pre ordem
    public int totalNos(Tree raiz) {

        if (raiz == null) {
            return 0;
        } else {
            return totalNos(raiz.esq) + totalNos(raiz.dir) + 1;
        }

    }

    //retorna a media de idade da árvore de acordo com a soma das idades e o total de nos da árvore
    public int mediaIdade(Tree raiz) {
        return somaIdades(raiz) / totalNos(raiz);
    }
}
