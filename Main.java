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

        System.out.println("Antes:");
        arvore.exibir("em");

        arvore.remover(5);

        System.out.println("Depois:");
        arvore.exibir("em");
    }
}