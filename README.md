# Árvore Binária com Remoção

Esse trabalho foi feito em Java e implementa uma árvore binária com inserção, exibição e remoção de nós.

A remoção funciona para:

- Nó folha
- Nó com um filho
- Nó com dois filhos

Para remover nós com dois filhos foi usado o método do **sucessor**, que pega o menor valor da subárvore da direita para substituir o nó removido.

A implementação foi feita de forma recursiva porque ficou mais simples de organizar e entender o código.

Como a árvore já funciona percorrendo os nós de forma recursiva, usar esse mesmo jeito na remoção deixou o código mais limpo e facilitou a atualização dos nós depois da remoção.

## Percursos disponíveis

- Pré-ordem
- Em-ordem
- Pós-ordem

## Arquivos

- `No.java`
- `ArvoreBinaria.java`
- `Main.java`