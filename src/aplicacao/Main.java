package aplicacao;

import dominio.Produto;
import dominio.ProdutoRepositorio;
import infraestrutura.ProdutoRepositorioMemoria;

public class Main {

    public static void main(String[] args) {

        ProdutoRepositorio repositorio = new ProdutoRepositorioMemoria();

        repositorio.salvar(new Produto(1, "Notebook", 3500.00, "Eletrônicos"));
        repositorio.salvar(new Produto(2, "Diário de Anne Frank", 60.00, "Livros"));
        repositorio.salvar(new Produto(3, "Celular", 2200.00, "Eletrônicos"));
        repositorio.salvar(new Produto(4, "Camiseta", 80.00, "Roupas"));
        repositorio.salvar(new Produto(5, "Entendendo Algoritmos", 50.00, "Livros"));

        System.out.println("Todos os produtos:");

        for (Produto produto : repositorio.listarTodos()) {
            System.out.println(produto);
        }

        System.out.println("\nCategorias:");

        for (String categoria : repositorio.listarCategorias()) {
            System.out.println(categoria);
        }
    }
}