public class Main {

    public static void main(String[] args) {

        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.inserir(0);
        arvore.inserir(-3);
        arvore.inserir(-5);
        arvore.inserir(-4);
        arvore.inserir(5);
        arvore.inserir(3);
        arvore.inserir(4);
        arvore.inserir(10);
        arvore.inserir(7);
        arvore.inserir(9);

        System.out.println("\nÁrvore inicial:");
        arvore.exibir("em");

        System.out.println("\nRemovendo nó folha (-4):");
        arvore.remover(-4);
        arvore.exibir("em");

        System.out.println("\nRemovendo nó com um filho (-5):");
        arvore.remover(-5);
        arvore.exibir("em");

        System.out.println("\nRemovendo nó com dois filhos (5):");
        arvore.remover(5);
        arvore.exibir("em");

        System.out.println("\nRemovendo raiz (0):");
        arvore.remover(0);
        arvore.exibir("em");

        System.out.println("\nTentando remover valor inexistente (99):");
        arvore.remover(99);
    }
}