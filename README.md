## Parte 1 — DDD (conceitos gerais)
1-b
2-c
3-b
4-b
5-a
6-c

## Parte 2 — Coleções em Java (List, Set, Map, Array/ArrayList, LinkedHashSet)
7-a
8-c
9-b
10-c
11-b
12-b


## Parte 3 — Projeto prático (combinando DDD + Coleções)
### 1. Por que usamos `Optional<Produto>` no método `buscarPorId`?

Porque o produto pode não existir. O `Optional` representa esse caso sem precisar retornar `null`, tornando o código mais seguro.

### 2. Por que `listarCategorias()` retorna um `Set` e não uma `List`?

Porque o `Set` não permite categorias repetidas. Usamos `LinkedHashSet` para também manter a ordem em que as categorias apareceram.

### 3. Se trocarmos o `ProdutoRepositorioMemoria` por uma versão com MySQL, o que muda na `Main`? E no `Produto`?

Na `Main`, basta trocar a implementação:

```java
new ProdutoRepositorioMemoria()
```

por:

```java
new ProdutoRepositorioMySQL()
```

O `Produto` não precisa ser alterado, pois ele pertence ao domínio e não depende da forma de armazenamento dos dados.

### 4. Qual estrutura foi usada para guardar os produtos e por quê?

Foi usado um `Map<Integer, Produto>`, com o `id` como chave e o produto como valor. Isso facilita a busca de um produto pelo seu `id`.
