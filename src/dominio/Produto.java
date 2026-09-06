package dominio;

public class Produto {

    private int id;
    private String nome;
    private double preco;
    private String categoria;

    public Produto(int id, String nome, double preco, String categoria) {

        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser vazio.");
        }

        if (preco < 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo.");
        }

        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}