public class ArvoreBinaria {

    private No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
        System.out.println("Árvore criada com sucesso.");
    }

    public void inserir(Integer valor) {
        raiz = inserirRec(raiz, valor);
    }

    private No inserirRec(No atual, Integer valor) {

        if (atual == null) {
            System.out.println("Valor " + valor + " inserido.");
            return new No(valor);
        }

        if (valor < atual.getConteudo()) {
            atual.setEsquerda(inserirRec(atual.getEsquerda(), valor));
        } else if (valor > atual.getConteudo()) {
            atual.setDireita(inserirRec(atual.getDireita(), valor));
        } else {
            System.out.println("Valor repetido não permitido.");
        }

        return atual;
    }

    public void remover(Integer valor) {
        raiz = removerRec(raiz, valor);
    }

    private No removerRec(No atual, Integer valor) {

        if (atual == null) {
            System.out.println("Valor " + valor + " não encontrado.");
            return null;
        }

        if (valor < atual.getConteudo()) {
            atual.setEsquerda(removerRec(atual.getEsquerda(), valor));
        }

        else if (valor > atual.getConteudo()) {
            atual.setDireita(removerRec(atual.getDireita(), valor));
        }

        else {

            if (atual.getEsquerda() == null && atual.getDireita() == null) {
                System.out.println("[Caso 1] Nó folha removido: " + valor);
                return null;
            }

            if (atual.getEsquerda() == null) {
                System.out.println("[Caso 2] Nó " + valor +
                        " substituído pelo filho direito.");
                return atual.getDireita();
            }

            if (atual.getDireita() == null) {
                System.out.println("[Caso 2] Nó " + valor +
                        " substituído pelo filho esquerdo.");
                return atual.getEsquerda();
            }

            Integer sucessor = menorValor(atual.getDireita());

            System.out.println("[Caso 3] Nó " + valor +
                    " substituído pelo sucessor " + sucessor);

            atual.setConteudo(sucessor);

            atual.setDireita(removerRec(atual.getDireita(), sucessor));
        }

        return atual;
    }

    private Integer menorValor(No no) {

        while (no.getEsquerda() != null) {
            no = no.getEsquerda();
        }

        return no.getConteudo();
    }

    public void exibir(String tipo) {

        switch (tipo.toLowerCase()) {

            case "pre":
                preOrdem(raiz);
                break;

            case "em":
                emOrdem(raiz);
                break;

            case "pos":
                posOrdem(raiz);
                break;
        }

        System.out.println();
    }

    private void preOrdem(No no) {
        if (no != null) {
            System.out.print(no.getConteudo() + " ");
            preOrdem(no.getEsquerda());
            preOrdem(no.getDireita());
        }
    }

    private void emOrdem(No no) {
        if (no != null) {
            emOrdem(no.getEsquerda());
            System.out.print(no.getConteudo() + " ");
            emOrdem(no.getDireita());
        }
    }

    private void posOrdem(No no) {
        if (no != null) {
            posOrdem(no.getEsquerda());
            posOrdem(no.getDireita());
            System.out.print(no.getConteudo() + " ");
        }
    }
}