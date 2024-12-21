package Livraria.service;

import Livraria.model.Livro;
import java.util.ArrayList;
import java.util.List;

public class LivrariaService {
    private List<Livro> livros;

    public LivrariaService() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listartLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            for (int i = 0; i < livros.size(); i++) {
                System.out.println((i + 1) + ". " + livros.get(i));
            }
        }
    }

    public Livro buscarLivroPorTitulo (String titulo) {
        for (Livro livro :livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public boolean removerLivro(String titulo) {
        Livro livro = buscarLivroPorTitulo(titulo);
        if (livro != null) {
            livros.remove(livro);
            return true;
        }
        return false;
    }
}
