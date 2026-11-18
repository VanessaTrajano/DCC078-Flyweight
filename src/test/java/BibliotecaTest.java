import org.example.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    @Test
    void deveRetornarAcervo() {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.cadastrarLivro("1984", "Companhia das Letras", "São Paulo");
        biblioteca.cadastrarLivro("A Revolução dos Bichos", "Companhia das Letras", "São Paulo");
        biblioteca.cadastrarLivro("O Hobbit", "HarperCollins", "Rio de Janeiro");

        List<String> saida = Arrays.asList(
                "Livro{titulo='1984', editora='Companhia das Letras', cidadeSede='São Paulo'}",
                "Livro{titulo='A Revolução dos Bichos', editora='Companhia das Letras', cidadeSede='São Paulo'}",
                "Livro{titulo='O Hobbit', editora='HarperCollins', cidadeSede='Rio de Janeiro'}"
        );

        assertEquals(saida, biblioteca.obterAcervo());
    }

    @Test
    void deveRetornarTotalEditoras() {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.cadastrarLivro("1984", "Companhia das Letras", "São Paulo");
        biblioteca.cadastrarLivro("A Revolução dos Bichos", "Companhia das Letras", "São Paulo");
        biblioteca.cadastrarLivro("O Hobbit", "HarperCollins", "Rio de Janeiro");

        assertEquals(2, EditoraFactory.getTotalEditoras());
    }

}