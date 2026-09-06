package infraestrutura;

import dominio.Produto;
import dominio.ProdutoRepositorio;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.LinkedHashMap;
import java.util.Set;

public class ProdutoRepositorioMemoria implements ProdutoRepositorio {

    private Map<Integer, Produto> produtos = new LinkedHashMap<>();

    @Override
    public void salvar(Produto produto) {
        produtos.put(produto.getId(), produto);
    }

    @Override
    public Optional<Produto> buscarPorId(int id) {
        return Optional.ofNullable(produtos.get(id));
    }

    @Override
    public List<Produto> listarTodos() {
        return new ArrayList<>(produtos.values());
    }

    @Override
    public Set<String> listarCategorias() {

        Set<String> categorias = new LinkedHashSet<>();

        for (Produto produto : produtos.values()) {
            categorias.add(produto.getCategoria());
        }

        return categorias;
    }
}