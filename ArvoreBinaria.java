public class ArvoreBinaria {

    private No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(Integer valor) {
        raiz = inserirRec(raiz, valor);
    }

    private No inserirRec(No atual, Integer valor) {
        if (atual == null) {
            return new No(valor);
        }

        if (valor < atual.getConteudo()) {
            atual.setEsquerda(inserirRec(atual.getEsquerda(), valor));
        } else if (valor > atual.getConteudo()) {
            atual.setDireita(inserirRec(atual.getDireita(), valor));
        }

        return atual;
    }

    public void remover(Integer valor) {
        raiz = removerRec(raiz, valor);
    }

    private No removerRec(No atual, Integer valor) {

        if (atual == null) {
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
                return null;
            }

            if (atual.getEsquerda() == null) {
                return atual.getDireita();
            }

            if (atual.getDireita() == null) {
                return atual.getEsquerda();
            }

            Integer sucessor = menorValor(atual.getDireita());

            atual.setConteudo(sucessor);

            atual.setDireita(removerRec(atual.getDireita(), sucessor));
        }

        return atual;
    }

    private Integer menorValor(No no) {
        Integer menor = no.getConteudo();

        while (no.getEsquerda() != null) {
            menor = no.getEsquerda().getConteudo();
            no = no.getEsquerda();
        }

        return menor;
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