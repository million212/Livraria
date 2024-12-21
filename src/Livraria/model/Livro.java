package Livraria.model;

public class Livro {
    private String titulo;
    private String autor;
    private double preco;
    private int estoque;

    public Livro(String titulo, String autor, double preco, int estoque) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return  "Livro:" + titulo +  "|Autor:" + autor +  "|Preço:R$ " + preco +  "|Estoque: " + estoque;
    }
}
