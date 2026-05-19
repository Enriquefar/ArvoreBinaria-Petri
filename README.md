# Árvore Binária com Remoção

Trabalho desenvolvido em Java para implementar uma Árvore Binária de Busca com inserção, remoção e exibição dos nós.

## Funcionalidades

O projeto permite:

- Inserir valores na árvore
- Remover valores
- Exibir percursos da árvore:
  - Pré-ordem
  - Em-ordem
  - Pós-ordem

## Casos de remoção implementados

### Nó folha
Quando o nó não possui filhos, ele é removido diretamente.

### Nó com um filho
O nó removido é substituído pelo seu único filho.

### Nó com dois filhos
Foi utilizado o método do sucessor, onde o nó removido é substituído pelo menor valor da subárvore direita.

## Estrutura dos arquivos

- `No.java` → representa cada nó da árvore
- `ArvoreBinaria.java` → implementação da árvore e métodos principais
- `Main.java` → testes de inserção, remoção e exibição

## Testes realizados

Foram testados os seguintes cenários:

- Remoção de nó folha
- Remoção de nó com um filho
- Remoção de nó com dois filhos
- Remoção da raiz
- Tentativa de remover valor inexistente

## Observação

A implementação foi feita utilizando recursividade, pois a própria estrutura da árvore se adapta naturalmente a esse tipo de abordagem, deixando o código mais organizado e fácil de entender.