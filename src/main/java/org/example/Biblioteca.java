package org.example;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> livros = new ArrayList<>();

    public void cadastrarLivro(String titulo, String nomeEditora, String cidadeSede) {
        Editora editora = EditoraFactory.getEditora(nomeEditora, cidadeSede);
        Livro livro = new Livro(titulo, editora);
        livros.add(livro);
    }

    public List<String> obterAcervo() {
        List<String> saida = new ArrayList<String>();
        for (Livro livro : this.livros) {
            saida.add(livro.obterLivro());
        }
        return saida;
    }
}