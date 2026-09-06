package dominio;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface ProdutoRepositorio {

    void salvar(Produto produto);

    Optional<Produto> buscarPorId(int id);

    List<Produto> listarTodos();

    Set<String> listarCategorias();
}